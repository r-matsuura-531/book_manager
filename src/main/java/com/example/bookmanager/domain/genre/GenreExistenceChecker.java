package com.example.bookmanager.domain.genre;

import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * ジャンルの存在チェックを行うドメインサービス
 */
@Component
@AllArgsConstructor
public class GenreExistenceChecker {

  private final GenreRepository genreRepository;
  private final MessageHelper messageHelper;

  /**
   * ジャンルIDが存在するかチェックする
   *
   * @param genreId 著者ID
   * @throws InvalidValueObjectException 出版社IDが存在しない場合
   */
  public void checkExistence(final GenreId genreId) throws InvalidValueObjectException {
    if (genreId == null) {
      throw new IllegalArgumentException("ジャンルIDが指定されていません");
    }

    if (!genreRepository.existsById(genreId)) {
      throw new ResourceNotFoundException(
          messageHelper.getMessageForResourceNotFound(new String[]{genreId.getValue()}));
    }
  }
}
