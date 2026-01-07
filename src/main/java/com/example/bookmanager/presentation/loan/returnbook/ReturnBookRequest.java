package com.example.bookmanager.presentation.loan.returnbook;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class ReturnBookRequest {

    @NotBlank(message = "{VLD-REQUIRED}")
    @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$", message = "{VLD-INVALID-FORMAT}")
    private String loanHistoryId;

}