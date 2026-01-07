package com.example.bookmanager.application.book.command.delete;

import com.example.bookmanager.domain.book.Book;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.book.BookRepository;
import com.example.bookmanager.domain.loanHistory.LoanHistoryCollection;
import com.example.bookmanager.domain.loanHistory.LoanHistoryRepository;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.CanNotDeleteBookException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class DeleteBookUseCase {

    private final BookRepository bookRepository;
    private final LoanHistoryRepository loanHistoryRepository;

    /**
     * 書籍を削除する
     *
     * @param input           削除する書籍データ
     * @param loginUserDetail ログインユーザ情報
     * @throws ResourceNotFoundException 書籍が存在しない場合
     * @throws CanNotDeleteBookException 貸出中の書籍を削除しようとした場合
     */
    @Transactional
    public void handle(final DeleteBookInput input,
                       final LoginUserDetail loginUserDetail)
            throws ResourceNotFoundException, CanNotDeleteBookException {

        final Book book = bookRepository.findById(new BookId(input.getId()));

        final LoanHistoryCollection loanHistoryCollection = loanHistoryRepository.findByBookId(book.getId());
        if (loanHistoryCollection.hasUnreturnedLoan()) {
            throw new CanNotDeleteBookException("貸出中の書籍は削除できません", "bookId");
        }

        bookRepository.delete(book, new UserId(loginUserDetail.getUserId()));
    }
}