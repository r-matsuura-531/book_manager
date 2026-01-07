package com.example.bookmanager.presentation.user.search;

import com.example.bookmanager.presentation.shared.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SearchUserResponseElem implements ApiResponse {

  private String id;

  private String lastName;

  private String firstName;

  private String email;

  private String role;
}