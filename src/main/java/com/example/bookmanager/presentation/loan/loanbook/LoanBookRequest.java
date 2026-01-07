package com.example.bookmanager.presentation.loan.loanbook;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class LoanBookRequest {

	@NotBlank(message = "{VLD-REQUIRED}")
	@Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$", message = "{VLD-INVALID-FORMAT}")
	private String bookId;

	@NotBlank(message = "{VLD-REQUIRED}")
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "{VLD-INVALID-FORMAT}")
	private String returnDueOn;
}