package com.example.bookmanager.presentation.shared;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorsResponse implements ApiResponse {

  private final List<Map<String, String>> errors;
}