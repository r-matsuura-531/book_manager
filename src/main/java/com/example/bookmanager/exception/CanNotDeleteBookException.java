package com.example.bookmanager.exception;

import lombok.Getter;

/**
 * 書籍を削除できない場合の例外
 */
@Getter
public class CanNotDeleteBookException extends Exception {

  private final String field;

  public CanNotDeleteBookException(final String message, final String field) {
    super(message);
    this.field = field;
  }
}