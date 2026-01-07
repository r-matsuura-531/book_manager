package com.example.bookmanager.domain.author;

import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 著者の存在チェックを行うドメインサービス
 */
@Component
@AllArgsConstructor
public class AuthorExistenceChecker {

  private final AuthorRepository authorRepository;
  private final MessageHelper messageHelper;

  /**
   * 著者IDが存在するかチェックする
   *
   * @param authorId 著者ID
   * @throws InvalidValueObjectException 著者IDが存在しない場合
   */
  public void checkExistence(final AuthorId authorId) throws InvalidValueObjectException {
    if (authorId == null) {
      throw new IllegalArgumentException("著者IDが指定されていません");
    }

    if (!authorRepository.existsById(authorId)) {
      throw new ResourceNotFoundException(messageHelper.getMessageForResourceNotFound(new String[]{authorId.getValue()}));
    }
  }
}
