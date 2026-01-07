package com.example.bookmanager.domain.user;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

/**
 * ユーザーID
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = String.class)
@AllArgsConstructor
public class UserId {

  private final String value;
}