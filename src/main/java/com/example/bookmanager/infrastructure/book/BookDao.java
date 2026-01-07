package com.example.bookmanager.infrastructure.book;

import com.example.bookmanager.application.book.query.search.SearchBookFilter;
import com.example.bookmanager.domain.book.BookId;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.example.bookmanager.domain.user.UserId;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface BookDao {

  /**
   * IDに紐づく書籍を取得する
   *
   * @param id ID
   * @return 書籍
   */
  @Select
  Optional<BookEntity> selectByBookId(BookId id);

  /**
   * IDに紐づく書籍を取得する
   *
   * @param id ID
   * @return 書籍
   */
  @Select
  Optional<SearchBookEntity> selectQueryModelByBookId(BookId id);

  /**
   * ISBNに紐づく書籍を取得する
   *
   * @param isbn ISBN
   * @return 書籍
   */
  @Select
  Optional<BookEntity> selectByIsbn(String isbn);

  /**
   * 書籍を検索する
   *
   * @param filter 検索条件
   * @return 検索結果
   */
  @Select
  List<SearchBookEntity> selectQueryModelByConditions(SearchBookFilter filter);

  /**
   * 書籍を登録する
   *
   * @param entity 書籍
   * @return 登録した書籍
   */
  @Insert(excludeNull = true)
  int insert(BookEntity entity);

  /**
   * 書籍を更新する
   *
   * @param entity 書籍
   * @return 更新した書籍
   */
  @Update(excludeNull = true)
  int update(BookEntity entity);

  /**
   * 指定の書籍IDの書籍を削除する
   *
   * @param id 書籍ID
   * @return 削除した書籍
   */
  @Update(sqlFile = true)
  int deleteById(BookId id, UserId userId, LocalDateTime now);
}