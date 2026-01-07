package com.example.bookmanager.application.user.command.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CreateUserInput {

  private String lastName;

  private String firstName;

  private String email;

  private String password;

  private Integer role;
}