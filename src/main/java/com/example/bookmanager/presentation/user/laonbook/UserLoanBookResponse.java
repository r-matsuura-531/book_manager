package com.example.bookmanager.presentation.user.laonbook;

import com.example.bookmanager.presentation.shared.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserLoanBookResponse implements ApiResponse {
    private final List<UserLoanBookResponseElem> loanedBooks;
}