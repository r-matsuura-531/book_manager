package com.example.bookmanager.infrastructure.genre;

import com.example.bookmanager.domain.genre.GenreId;
import java.util.Optional;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface GenreDao {

  /**
   * IDに紐づくジャンルを取得する
   *
   * @param id ジャンルID
   * @return ジャンル
   */
  @Select
  Optional<GenreEntity> selectById(GenreId id);
}
