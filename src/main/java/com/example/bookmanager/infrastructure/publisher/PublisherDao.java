package com.example.bookmanager.infrastructure.publisher;

import com.example.bookmanager.domain.publisher.PublisherId;
import java.util.Optional;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface PublisherDao {

  /**
   * IDに紐づく出版社を取得する
   *
   * @param id 出版社ID
   * @return 出版社
   */
  @Select
  Optional<PublisherEntity> selectById(PublisherId id);

}