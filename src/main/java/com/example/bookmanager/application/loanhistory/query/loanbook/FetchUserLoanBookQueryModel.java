package com.example.bookmanager.application.loanhistory.query.loanbook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FetchUserLoanBookQueryModel {

    private final String id;

    private final String title;

    private final String authorName;

    private final String publisherName;

    private final LocalDateTime loanedAt;

    private final LocalDate returnDueOn;

    private final LocalDateTime returnedAt;

    private final String loanStatus;

    private final Integer overDueDays;
}