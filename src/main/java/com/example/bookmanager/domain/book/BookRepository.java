package com.example.bookmanager.domain.book;

import com.example.bookmanager.domain.user.UserId;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {

    /**
     * 書籍IDに対応する書籍を取得する
     *
     * @param id 書籍ID
     * @return 書籍
     */
    Book findById(BookId id);

    /**
     * ISBNに対応する書籍が存在するか確認する
     *
     * @param isbn ISBN
     * @return 存在する場合はtrue
     */
    boolean existsByIsbn(Isbn isbn);

    /**
     * 書籍を登録する
     *
     * @param book   書籍
     * @param userId 作成者
     */
    void register(Book book, UserId userId);

    /**
     * 書籍を更新する
     *
     * @param book   書籍
     * @param userId 更新者
     */
    void update(Book book, UserId userId);

    /**
     * 書籍を論理削除する
     *
     * @param book   書籍
     * @param userId 更新者
     */
    void delete(Book book, UserId userId);
}
