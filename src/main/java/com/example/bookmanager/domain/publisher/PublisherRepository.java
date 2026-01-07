package com.example.bookmanager.domain.publisher;

import org.springframework.stereotype.Repository;

/**
 * 出版社リポジトリ
 */
@Repository
public interface PublisherRepository {

  /**
   * 出版社IDに対応する出版社が存在するか確認する
   *
   * @param publisherId 出版社ID
   * @return 存在する場合はtrue
   */
  boolean existsById(PublisherId publisherId);
}