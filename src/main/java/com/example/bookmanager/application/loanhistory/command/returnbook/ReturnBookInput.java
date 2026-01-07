package com.example.bookmanager.application.loanhistory.command.returnbook;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class ReturnBookInput {

	private final String loanHistoryId;

}