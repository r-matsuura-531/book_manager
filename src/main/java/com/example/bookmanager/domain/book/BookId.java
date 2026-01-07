package com.example.bookmanager.domain.book;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

/**
 * 書籍ID
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = String.class)
@AllArgsConstructor
public class BookId {

  private final String value;
}