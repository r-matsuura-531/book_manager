package com.example.bookmanager.infrastructure.author;

import com.example.bookmanager.domain.author.AuthorId;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.Optional;

@Dao
@ConfigAutowireable
public interface AuthorDao {

    /**
     * IDに紐づく著者を取得する
     *
     * @param id 著者ID
     * @return 著者
     */
    @Select
    Optional<AuthorEntity> selectById(AuthorId id);
}
