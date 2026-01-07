package com.example.bookmanager.domain.publisher;

import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 出版社の存在チェックを行うドメインサービス
 */
@Component
@AllArgsConstructor
public class PublisherExistenceChecker {

  private final PublisherRepository publisherRepository;
  private final MessageHelper messageHelper;

  /**
   * 出版社IDが存在するかチェックする
   *
   * @param publisherId 著者ID
   * @throws InvalidValueObjectException 出版社IDが存在しない場合
   */
  public void checkExistence(final PublisherId publisherId) throws InvalidValueObjectException {
    if (publisherId == null) {
      throw new IllegalArgumentException("出版社IDが指定されていません");
    }

    if (!publisherRepository.existsById(publisherId)) {
      throw new ResourceNotFoundException(
          messageHelper.getMessageForResourceNotFound(new String[]{publisherId.getValue()}));
    }
  }
}
