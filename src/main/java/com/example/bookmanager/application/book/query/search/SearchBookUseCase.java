package com.example.bookmanager.application.book.query.search;

import com.example.bookmanager.application.book.query.BookQueryService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SearchBookUseCase {

  private final BookQueryService bookQueryService;

  /**
   * 書籍を検索する
   *
   * @param filter 検索条件
   * @return 検索結果
   */
  public List<SearchBookQueryModel> handle(final SearchBookFilter filter) {
    return bookQueryService.SearchBookQueryModel(filter);
  }
}