package com.example.bookmanager.infrastructure.helper;

import java.util.Objects;
import com.example.bookmanager.common.helper.MessageHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RepositoryHelper {

  private final MessageHelper messageHelper;

  /**
   * 行が更新されたかどうかを検証する
   *
   * @param expected 期待する件数
   * @param actual   実際の件数
   */
  public void verifyExpectedRowCount(final int expected, final int actual) {
    if (!Objects.equals(expected, actual)) {
      throw new IllegalStateException(
          messageHelper.getMessageForUpdateFailed(expected, actual));
    }
  }
}