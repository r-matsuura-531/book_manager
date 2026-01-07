package com.example.bookmanager.domain.genre;

import org.springframework.stereotype.Repository;

/**
 * ジャンルリポジトリ
 */
@Repository
public interface GenreRepository {

  /**
   * ジャンルIDに対応するジャンルが存在するか確認する
   *
   * @param genreId ジャンルID
   * @return 存在する場合はtrue
   */
  boolean existsById(GenreId genreId);
}