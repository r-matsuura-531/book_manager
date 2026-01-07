package com.example.bookmanager.application.book.command.update;

import com.example.bookmanager.domain.author.AuthorExistenceChecker;
import com.example.bookmanager.domain.author.AuthorId;
import com.example.bookmanager.domain.book.Book;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.book.BookRepository;
import com.example.bookmanager.domain.genre.GenreExistenceChecker;
import com.example.bookmanager.domain.genre.GenreId;
import com.example.bookmanager.domain.publisher.PublisherExistenceChecker;
import com.example.bookmanager.domain.publisher.PublisherId;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UpdateBookUseCase {

  private final BookRepository bookRepository;
  private final AuthorExistenceChecker authorExistenceChecker;
  private final PublisherExistenceChecker publisherExistenceChecker;
  private final GenreExistenceChecker genreExistenceChecker;

  /**
   * 書籍を編集する
   *
   * @param input           編集する書籍データ
   * @param loginUserDetail ログインユーザ情報
   * @throws InvalidValueObjectException 著者ID、出版社ID、ジャンルIDが不正な場合
   * @throws ResourceNotFoundException   書籍が存在しない場合
   */
  @Transactional
  public void handle(final UpdateBookInput input,
      final LoginUserDetail loginUserDetail)
      throws InvalidValueObjectException, ResourceNotFoundException {

    // 著者IDの存在チェック
    final AuthorId authorId = new AuthorId(input.getAuthorId());
    authorExistenceChecker.checkExistence(authorId);

    // 出版社IDの存在チェック
    final PublisherId publisherId = new PublisherId(input.getPublisherId());
    publisherExistenceChecker.checkExistence(publisherId);

    // ジャンルIDの存在チェック
    final GenreId genreId = new GenreId(input.getGenreId());
    genreExistenceChecker.checkExistence(genreId);

    final Book beforeBook = bookRepository.findById(new BookId(input.getId()));
    final Book updatedBook = beforeBook.update(input.getTitle(), authorId, publisherId, genreId,
        input.getStock());

    bookRepository.update(updatedBook, loginUserDetail.getUser().getId());
  }
}
