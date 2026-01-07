package com.example.bookmanager.application.book.query;

import com.example.bookmanager.application.book.query.search.SearchBookFilter;
import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.domain.book.BookId;
import java.util.List;

public interface BookQueryService {

  /**
   * 書籍IDに対応する書籍を取得する
   *
   * @param id 書籍ID
   * @return 書籍
   */
  SearchBookQueryModel findSearchBookQueryModelById(BookId id);

  /**
   * 書籍を検索する
   *
   * @param filter 検索条件
   * @return 検索結果
   */
  List<SearchBookQueryModel> SearchBookQueryModel(SearchBookFilter filter);
}