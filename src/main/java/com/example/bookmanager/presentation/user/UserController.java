package com.example.bookmanager.presentation.user;

import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookQueryModel;
import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookUseCase;
import com.example.bookmanager.application.user.command.create.CreateUserInput;
import com.example.bookmanager.application.user.command.create.CreateUserUseCase;
import com.example.bookmanager.application.user.query.find.FindUserByUserIdUseCase;
import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.DuplicateValueException;
import com.example.bookmanager.presentation.user.laonbook.UserLoanBookResponse;
import com.example.bookmanager.presentation.user.laonbook.UserLoanBookResponseFactory;
import com.example.bookmanager.presentation.shared.ApiResponse;
import com.example.bookmanager.presentation.shared.ErrorsResponse;
import com.example.bookmanager.presentation.user.create.CreateUserRequest;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final FindUserByUserIdUseCase findUserByUserIdUseCase;
    private final UserPresentationMapper userPresentationMapper;
    private final FetchUserLoanBookUseCase fetchUserLoanBookUseCase;

    @PostMapping
    public ResponseEntity<ApiResponse> insert(@RequestBody final CreateUserRequest request) {
        final CreateUserInput input = CreateUserInput.builder().lastName(request.getLastName())
                .firstName(request.getFirstName()).email(request.getEmail()).password(request.getPassword())
                .role(request.getRole()).build();

        try {
            final UserId userId = createUserUseCase.create(input);
            final SearchUserQueryModel queryModel = findUserByUserIdUseCase.execute(userId);
            return ResponseEntity.ok(userPresentationMapper.toSearchResponse(queryModel));

        } catch (DuplicateValueException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        }
    }

    /**
     * 貸し出し履歴を取得する
     */
    @GetMapping("/loan-book")
    public ResponseEntity<ApiResponse> getUserLoanBook(
            @AuthenticationPrincipal final LoginUserDetail loginUserDetail) {

        final UserId loginUserId = new UserId(loginUserDetail.getUserId());
        final List<FetchUserLoanBookQueryModel> loanedBookHistoryList = fetchUserLoanBookUseCase.exezcute(loginUserId);
        final UserLoanBookResponse loanedBooks = UserLoanBookResponseFactory.create(loanedBookHistoryList);

        return ResponseEntity.ok(loanedBooks);
    }
}