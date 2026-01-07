package com.example.bookmanager.application.loanhistory.command.returnbook;

import com.example.bookmanager.domain.book.Book;
import com.example.bookmanager.domain.book.BookRepository;
import com.example.bookmanager.domain.loanHistory.LoanHistory;
import com.example.bookmanager.domain.loanHistory.LoanHistoryId;
import com.example.bookmanager.domain.loanHistory.LoanHistoryRepository;
import com.example.bookmanager.domain.loanHistory.ReturnedAt;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.BookAlreadyReturnedException;
import com.example.bookmanager.exception.CanNotReturnBookException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ReturnBookUseCase {

    private final BookRepository bookRepository;
    private final LoanHistoryRepository loanHistoryRepository;

    /**
     * 書籍の返却を行う
     *
     * @param input           返却する貸出履歴データ
     * @param loginUserDetail ログイン中のユーザーデータ
     * @throws ResourceNotFoundException   貸し出し履歴が存在しない場合
     * @throws BookAlreadyReturnedException 返却済みの貸出履歴を返却しようとした場合
     * @throws CanNotReturnBookException    書籍の返却ができない場合
     */
    @Transactional
    public void execute(
            final ReturnBookInput input,
            final LoginUserDetail loginUserDetail)
            throws ResourceNotFoundException, BookAlreadyReturnedException , CanNotReturnBookException {

        final LoanHistoryId loanHistoryId = new LoanHistoryId(input.getLoanHistoryId());
        final UserId userId = new UserId(loginUserDetail.getUserId());

        //貸出履歴の取得
        final LoanHistory loanHistory = loanHistoryRepository.findById(loanHistoryId);

        //貸し出し書籍の取得
        final Book book = bookRepository.findById(loanHistory.getBookId());

        //貸し出し履歴のユーザIDとログインユーザIDが一致するかチェック
        if (!loanHistory.isLoanedBy(userId)) {
            throw new CanNotReturnBookException("指定の貸出履歴は操作中のユーザーのものではありません", "loanHistoryId");
        }

        //貸し出し履歴が返却済みかチェック
        if (loanHistory.isReturned()) {
            throw new BookAlreadyReturnedException("指定の貸出書籍は既に返却済みです", "loanHistoryId");
        }

        final LoanHistory returnedLoanHistory = loanHistory.createReturnedLoanHistory();

        //貸出履歴を登録
        loanHistoryRepository.update(returnedLoanHistory, userId);
        //貸出後の書籍の在庫数を更新
        final Book returnedBook = book.returnBook();
        bookRepository.update(returnedBook, userId);
    }

}
