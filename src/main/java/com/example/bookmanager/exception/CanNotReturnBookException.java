package com.example.bookmanager.exception;

import lombok.Getter;

/**
 * 書籍を返却できない場合にスローされる例外クラス
 */
@Getter
public class CanNotReturnBookException extends Exception {

  private final String field;

  public CanNotReturnBookException(final String message, final String field) {
    super(message);
    this.field = field;
  }
}