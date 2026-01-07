package com.example.bookmanager.domain.user;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor()
public enum UserRole {
  ADMIN(0, "管理者"),
  USER(1, "一般ユーザー");

  private final Integer value;
  private final String label;

  public static UserRole of(Integer value) {
    return Arrays.stream(UserRole.values())
        .filter(element -> element.value.equals(value))
        .findFirst()
        .orElseThrow();
  }
}