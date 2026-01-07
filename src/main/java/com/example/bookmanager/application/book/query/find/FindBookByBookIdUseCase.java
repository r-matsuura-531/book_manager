package com.example.bookmanager.application.book.query.find;

import com.example.bookmanager.application.book.query.BookQueryService;
import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.domain.book.BookId;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FindBookByBookIdUseCase {

  private final BookQueryService bookQueryService;

  /**
   * 書籍IDに対応する書籍を取得する
   *
   * @param id 書籍ID
   * @return 書籍
   */
  public SearchBookQueryModel handle(final BookId id) {
    return bookQueryService.findSearchBookQueryModelById(id);
  }
}
