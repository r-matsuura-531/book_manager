package com.example.bookmanager.presentation.user.laonbook;

import com.example.bookmanager.presentation.shared.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoanBookResponseElem implements ApiResponse {

    private final String id;

    private final String title;

    private final String authorName;

    private final String publisherName;

    private final String loanedAt;

    private final String returnDueOn;

    private final String returnedAt;

    private final String loanStatus;

    private final Integer overDueDays;
}