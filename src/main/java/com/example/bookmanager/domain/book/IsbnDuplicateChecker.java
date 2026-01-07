package com.example.bookmanager.domain.book;

import com.example.bookmanager.exception.DuplicateValueException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;


/**
 * ISBNの重複チェックを行うドメインサービス
 */
@Component
@AllArgsConstructor
public class IsbnDuplicateChecker {

  private final BookRepository bookRepository;

  /**
   * ISBNが重複しているかチェックする
   *
   * @param isbn ISBN
   * @throws DuplicateValueException ISBNが重複している場合
   */
  public void checkDuplicate(final Isbn isbn) throws DuplicateValueException {
    if (isbn == null) {
        throw new IllegalArgumentException("ISBNが指定されていません");
    }
    
    if (bookRepository.existsByIsbn(isbn)) {
      throw new DuplicateValueException("ISBNが重複しています", "isbn");
    }
  }
}