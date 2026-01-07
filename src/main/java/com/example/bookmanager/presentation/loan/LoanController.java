package com.example.bookmanager.presentation.loan;

import com.example.bookmanager.application.loanhistory.command.loanbook.LoanBookInput;
import com.example.bookmanager.application.loanhistory.command.loanbook.LoanBookUseCase;
import com.example.bookmanager.application.loanhistory.command.returnbook.ReturnBookInput;
import com.example.bookmanager.application.loanhistory.command.returnbook.ReturnBookUseCase;
import com.example.bookmanager.exception.BookAlreadyReturnedException;
import com.example.bookmanager.exception.CanNotLoanBookException;
import com.example.bookmanager.exception.CanNotReturnBookException;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.presentation.loan.loanbook.LoanBookRequest;
import com.example.bookmanager.presentation.loan.returnbook.ReturnBookRequest;
import com.example.bookmanager.presentation.shared.ApiResponse;
import com.example.bookmanager.presentation.shared.ErrorsResponse;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loans")
@AllArgsConstructor
public class LoanController {

    private final LoanBookUseCase loanBookUseCase;
    private final ReturnBookUseCase returnBookUseCase;

    /**
     * 書籍の貸出を行う
     *
     * @param request         貸出する書籍データ
     * @param loginUserDetail ログイン中のユーザーデータ
     * @return 貸出結果
     */
    @PostMapping
    public ResponseEntity<ApiResponse> loanBook(
            @Validated @RequestBody final LoanBookRequest request,
            @AuthenticationPrincipal final LoginUserDetail loginUserDetail) {

        final LoanBookInput input = LoanBookInput.builder()
                .bookId(request.getBookId())
                .returnDueOn(LocalDate.parse(request.getReturnDueOn()))
                .build();

        try {
            loanBookUseCase.execute(input, loginUserDetail);
        } catch (InvalidValueObjectException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        } catch (CanNotLoanBookException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        }


        return ResponseEntity.ok().build();
    }

    /**
     * 書籍の返却を行う
     *
     * @param request         返却する貸出履歴データ
     * @param loginUserDetail ログイン中のユーザーデータ
     * @return 書籍の返却結果
     */
    @PostMapping("/return")
    public ResponseEntity<ApiResponse> returnBook(
            @Validated @RequestBody final ReturnBookRequest request,
            @AuthenticationPrincipal final LoginUserDetail loginUserDetail) {

        final ReturnBookInput input = ReturnBookInput.builder()
                .loanHistoryId(request.getLoanHistoryId())
                .build();

        try {
            returnBookUseCase.execute(input, loginUserDetail);
        } catch (BookAlreadyReturnedException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        } catch (CanNotReturnBookException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        }

        return ResponseEntity.ok().build();
    }
}
