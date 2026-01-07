package com.example.bookmanager.presentation.shared;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse implements ApiResponse {

  private final String message;
}