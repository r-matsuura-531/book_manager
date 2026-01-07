package com.example.bookmanager.exception;

import lombok.Getter;

/**
 * 不正な値オブジェクトの例外
 */
@Getter
public class BookAlreadyReturnedException extends Exception {

  private final String field;

  public BookAlreadyReturnedException(final String message, final String field) {
    super(message);
    this.field = field;
  }
}