package com.example.bookmanager.exception;

import lombok.Getter;

/**
 * 書籍を貸し出せない場合の例外
 */
@Getter
public class CanNotLoanBookException extends Exception {

  private final String field;

  public CanNotLoanBookException(final String message, final String field) {
    super(message);
    this.field = field;
  }
}