package com.example.bookmanager.presentation.user.create;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateUserRequest {

  private String lastName;

  private String firstName;

  private String email;

  private String password;

  private Integer role;
}