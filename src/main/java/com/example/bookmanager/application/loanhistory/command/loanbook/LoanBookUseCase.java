package com.example.bookmanager.application.loanhistory.command.loanbook;

import com.example.bookmanager.domain.book.Book;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.book.BookRepository;
import com.example.bookmanager.domain.loanHistory.LoanHistory;
import com.example.bookmanager.domain.loanHistory.LoanHistoryRepository;
import com.example.bookmanager.domain.loanHistory.LoanedAt;
import com.example.bookmanager.domain.loanHistory.ReturnDueOn;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.CanNotLoanBookException;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class LoanBookUseCase {

	private final BookRepository bookRepository;
	private final LoanHistoryRepository loanHistoryRepository;

	/**
	 * 書籍の貸出履歴を登録する
	 * @param input 貸出する書籍データ
	 * @param loginUserDetail ログイン中のユーザーデータ
	 * @throws ResourceNotFoundException 書籍が存在しない場合
	 * @throws CanNotLoanBookException 書籍が貸出可能ではない場合
	 * @throws InvalidValueObjectException 返却期限日が不正な場合
	 */
	@Transactional
	public void execute(
			final LoanBookInput input,
			final LoginUserDetail loginUserDetail)
			throws ResourceNotFoundException, CanNotLoanBookException, InvalidValueObjectException {

		final BookId bookId = new BookId(input.getBookId());
		final ReturnDueOn returnDueOn = new ReturnDueOn(input.getReturnDueOn());
		final UserId userId = new UserId(loginUserDetail.getUserId());

		final Book book = bookRepository.findById(bookId);

		//返却期限日が未来の場合
		if (!returnDueOn.hasFutureDate()) {
			throw new InvalidValueObjectException("返却期限日は現在日時よりも未来でなければなりません", "returnDueOn");
		}

		//返却期限日が2週間後以上の日付の場合
		if (!returnDueOn.hasWithinNextTwoWeeks()) {
			throw new InvalidValueObjectException("返却期限日は2週間以内でなければなりません", "returnDueOn");
		}

		//書籍が貸出可能かチェック
		if (!book.canLoan()) {
			throw new CanNotLoanBookException("書籍が貸出可能ではありません", "bookId");
		}

		final LoanHistory loanHistory = LoanHistory.createNewLoanHistory(
				bookId,
				userId,
				new LoanedAt(LocalDateTime.now()),
				returnDueOn
		);

		//貸出履歴を登録
		loanHistoryRepository.register(loanHistory, userId);
		//貸出後の書籍の在庫数を更新
		final Book loanedBook = book.loanToUser();
		bookRepository.update(loanedBook, userId);
	}

}
