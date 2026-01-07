package com.example.bookmanager.presentation.sample;

import com.example.bookmanager.application.user.command.create.CreateUserInput;
import com.example.bookmanager.application.user.command.create.CreateUserUseCase;
import com.example.bookmanager.application.user.query.find.FindUserByUserIdUseCase;
import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.DuplicateValueException;
import com.example.bookmanager.presentation.shared.ApiResponse;
import com.example.bookmanager.presentation.shared.ErrorsResponse;
import com.example.bookmanager.presentation.user.UserPresentationMapper;
import com.example.bookmanager.presentation.user.create.CreateUserRequest;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/sample")
public class SampleController {

  private final CreateUserUseCase createUserUseCase;
  private final FindUserByUserIdUseCase findUserByUserIdUseCase;
  private final UserPresentationMapper userPresentationMapper;

  @PostMapping("/create-user")
  public ResponseEntity<ApiResponse> insert(@RequestBody final CreateUserRequest request) {
    final CreateUserInput input = CreateUserInput
        .builder()
        .lastName(request.getLastName())
        .firstName(request.getFirstName())
        .email(request.getEmail())
        .password(request.getPassword())
        .role(request.getRole())
        .build();

    try {
      final UserId userId = createUserUseCase.create(input);
      final SearchUserQueryModel queryModel = findUserByUserIdUseCase.execute(userId);
      return ResponseEntity.ok(userPresentationMapper.toSearchResponse(queryModel));

    } catch (DuplicateValueException e) {
      return ResponseEntity.badRequest()
          .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
    }
  }
}