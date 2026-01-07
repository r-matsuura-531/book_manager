package com.example.bookmanager.domain.user;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class User implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private final UserId id;

  private final String lastName;

  private final String firstName;

  private final String email;

  private final String password;

  private UserRole role;

  public static User restore(final UserId id, final String lastName, final String firstName,
      final String email, final String password, final UserRole role) {

    return new User(id, lastName, firstName, email, password, role);
  }

  public static User createNewUser(final String lastName, final String firstName, final String email,
      final String password, final UserRole role) {

    final UserId userId = new UserId(UUID.randomUUID().toString());

    return new User(userId, lastName, firstName, email, password, role);
  }
}