package com.example.bookmanager.domain.author;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

/**
 * 著者ID
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = String.class)
@AllArgsConstructor
public class AuthorId {

  private final String value;
}