package com.example.bookmanager.domain.book;

import com.example.bookmanager.domain.author.AuthorId;
import com.example.bookmanager.domain.genre.GenreId;
import com.example.bookmanager.domain.publisher.PublisherId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Book {

    private final BookId id;

    private final Isbn isbn;

    private final String title;

    private final AuthorId authorId;

    private final PublisherId publisherId;

    private final GenreId genreId;

    private final int stock;

    private final LocalDate publicationDate;

    /**
     * DBのデータの復元用のファクトリメソッド
     */
    public static Book restore(final BookId id, final Isbn isbn, final String title,
                               final AuthorId authorId, final PublisherId publisherId, final GenreId genreId, final int stock,
                               final LocalDate publicationDate) {

        return new Book(id, isbn, title, authorId, publisherId, genreId, stock, publicationDate);
    }

    /**
     * 新規登録用のファクトリメソッド
     *
     * @param isbn            ISBN
     * @param title           タイトル
     * @param authorId        著者ID
     * @param publisherId     出版社ID
     * @param genreId         ジャンルID
     * @param stock           在庫数
     * @param publicationDate 出版日
     * @return 書籍
     */
    public static Book createNewBook(final Isbn isbn, final String title, final AuthorId authorId,
                                     final PublisherId publisherId, final GenreId genreId, final int stock,
                                     final LocalDate publicationDate) {

        final BookId bookId = new BookId(java.util.UUID.randomUUID().toString());

        return new Book(bookId, isbn, title, authorId, publisherId, genreId, stock, publicationDate);
    }

    /**
     * 書籍情報更新用のファクトリメソッド
     *
     * @param title       タイトル
     * @param authorId    著者ID
     * @param publisherId 出版社ID
     * @param genreId     ジャンルID
     * @param stock       在庫数
     */
    public Book update(final String title, final AuthorId authorId, final PublisherId publisherId,
                       final GenreId genreId, final int stock) {

        return new Book(this.id, this.isbn, title, authorId, publisherId, genreId, stock, this.publicationDate);
    }

    /**
     * 貸し出し用のファクトリメソッド
     */
    public Book loanToUser() {
        return new Book(this.id, this.isbn, this.title, this.authorId, this.publisherId, this.genreId,
                this.stock - 1, this.publicationDate);
    }

    /**
     * 返却用のファクトリメソッド
     */
    public Book returnBook() {
        return new Book(this.id, this.isbn, this.title, this.authorId, this.publisherId, this.genreId,
                this.stock + 1, this.publicationDate);
    }

    /**
     * 貸し出し可能かどうかを判定する
     */
    public boolean canLoan() {
        return this.stock > 0;
    }
}