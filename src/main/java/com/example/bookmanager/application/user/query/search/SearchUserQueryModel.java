package com.example.bookmanager.application.user.query.search;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SearchUserQueryModel {

  private final String id;

  private final String lastName;

  private final String firstName;

  private final String email;

  private final String role;
}