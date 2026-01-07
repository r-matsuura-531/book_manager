package com.example.bookmanager.application.loanhistory.command.loanbook;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class LoanBookInput {

	private final String bookId;

	private final LocalDate returnDueOn;
}