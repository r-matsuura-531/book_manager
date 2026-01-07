package com.example.bookmanager.common.helper;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class MessageHelper {

  private final MessageSource messageSource;

  /**
   * メッセージ取得
   *
   * @param key  キー
   * @param args メッセージ引数
   * @return メッセージ
   */
  private String getMessage(final String key, final Object[] args) throws NoSuchMessageException {
    return messageSource.getMessage(key, args, LocaleContextHolder.getLocale());
  }

  /**
   * リソースが見つからない場合のメッセージを取得
   *
   * @param args メッセージ引数
   * @return メッセージ
   */
  public String getMessageForResourceNotFound(Object[] args) {
    return getMessage("ERR-NOT-FOUND", args);
  }

  /**
   * 更新に失敗した場合のメッセージを取得
   *
   * @param expected 期待する件数
   * @param actual   実際の件数
   * @return メッセージ
   */
  public String getMessageForUpdateFailed(final int expected, final int actual) {
    return getMessage("ERR-UNEXPECTED-UPDATE-COUNT", new Object[]{expected, actual});
  }
}