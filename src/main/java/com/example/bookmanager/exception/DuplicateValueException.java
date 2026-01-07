package com.example.bookmanager.exception;

import lombok.Getter;

/**
 * ISBNが重複している場合の例外
 */
@Getter
public class DuplicateValueException extends Exception {

  private final String field;

  public DuplicateValueException(final String message, final String field) {
    super(message);
    this.field = field;
  }
}