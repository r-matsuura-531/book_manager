package com.example.bookmanager.infrastructure.user;

import java.util.Optional;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface UserDao {

  @Select
  Optional<UserEntity> selectById(String id);

  @Select
  Optional<UserEntity>  selectByEmail(String email);

  @Insert
  int insert(UserEntity entity);
}