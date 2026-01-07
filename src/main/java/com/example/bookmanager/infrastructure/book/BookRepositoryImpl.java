package com.example.bookmanager.infrastructure.book;

import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.domain.author.AuthorId;
import com.example.bookmanager.domain.book.Book;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.book.BookRepository;
import com.example.bookmanager.domain.book.Isbn;
import com.example.bookmanager.domain.genre.GenreId;
import com.example.bookmanager.domain.publisher.PublisherId;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.infrastructure.helper.RepositoryHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
@AllArgsConstructor
class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;
    private final MessageHelper messageHelper;
    private final RepositoryHelper repositoryHelper;

    @Override
    public Book findById(final BookId id) {
        return bookDao.selectByBookId(id)
                .map(
                        bookEntity -> Book.restore(
                                new BookId(bookEntity.getId()),
                                Isbn.restore(bookEntity.getIsbn()),
                                bookEntity.getTitle(),
                                new AuthorId(bookEntity.getAuthorId()),
                                new PublisherId(bookEntity.getPublisherId()),
                                new GenreId(bookEntity.getGenreId()),
                                bookEntity.getStock(),
                                bookEntity.getPublicationDate()
                        ))
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                messageHelper.getMessageForResourceNotFound(new String[]{id.getValue()}))
                );
    }

    @Override
    public boolean existsByIsbn(Isbn isbn) {
        return bookDao.selectByIsbn(isbn.getValue()).isPresent();
    }

    @Override
    public void register(final Book book, final UserId userId) {
        final BookEntity entity = toEntityForCreate(book, userId);
        final int insertCount = bookDao.insert(entity);

        repositoryHelper.verifyExpectedRowCount(1, insertCount);
    }

    @Override
    public void update(final Book book, final UserId userId) {
        assertExistsById(book.getId());
        final BookEntity entity = toEntityForUpdate(book, userId);
        final int updateCount = bookDao.update(entity);

        repositoryHelper.verifyExpectedRowCount(1, updateCount);
    }

    @Override
    public void delete(final Book book, final UserId userId) {
        assertExistsById(book.getId());
        final int deleteCount = bookDao.deleteById(book.getId(), userId, LocalDateTime.now());

        repositoryHelper.verifyExpectedRowCount(1, deleteCount);
    }

    /**
     * BookIdに対応する書籍情報があるか確認する
     *
     * @param id 確認する書籍ID
     */
    private void assertExistsById(final BookId id) {
        bookDao.selectByBookId(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                messageHelper.getMessageForResourceNotFound(new String[]{id.getValue()}))
                );
    }

    /**
     * 書籍情報を登録用のEntityに変換する
     *
     * @param book   書籍情報
     * @param userId ユーザID
     * @return 登録用のEntity
     */
    private BookEntity toEntityForCreate(final Book book, final UserId userId) {

        final BookEntity entity = new BookEntity();
        entity.setId(book.getId().getValue());
        entity.setIsbn(book.getIsbn().getValue());
        entity.setTitle(book.getTitle());
        entity.setAuthorId(book.getAuthorId().getValue());
        entity.setPublisherId(book.getPublisherId().getValue());
        entity.setGenreId(book.getGenreId().getValue());
        entity.setStock(book.getStock());
        entity.setPublicationDate(book.getPublicationDate());
        entity.setCreatedBy(userId.getValue());
        entity.setCreatedAt(java.time.LocalDateTime.now());

        return entity;
    }

    /**
     * 書籍情報を更新用のEntityに変換する
     *
     * @param book   書籍情報
     * @param userId ユーザID
     * @return 更新用のEntity
     */
    private BookEntity toEntityForUpdate(final Book book, final UserId userId) {

        final BookEntity entity = new BookEntity();
        entity.setId(book.getId().getValue());
        entity.setIsbn(book.getIsbn().getValue());
        entity.setTitle(book.getTitle());
        entity.setAuthorId(book.getAuthorId().getValue());
        entity.setPublisherId(book.getPublisherId().getValue());
        entity.setGenreId(book.getGenreId().getValue());
        entity.setStock(book.getStock());
        entity.setPublicationDate(book.getPublicationDate());
        entity.setUpdatedBy(userId.getValue());
        entity.setUpdatedAt(java.time.LocalDateTime.now());

        return entity;
    }
}
