package com.example.bookmanager.domain.author;

import org.springframework.stereotype.Repository;

/**
 * 著者リポジトリ
 */
@Repository
public interface AuthorRepository {

  /**
   * 著者IDに対応する著者が存在するか確認する
   *
   * @param authorId 著者ID
   * @return 存在する場合はtrue
   */
  boolean existsById(AuthorId authorId);
}