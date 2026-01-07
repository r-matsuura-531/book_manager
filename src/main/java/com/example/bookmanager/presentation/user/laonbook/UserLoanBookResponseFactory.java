package com.example.bookmanager.presentation.user.laonbook;

import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookQueryModel;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 貸出履歴のレスポンスを生成するファクトリクラス
 * */
@Component
public class UserLoanBookResponseFactory {

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static UserLoanBookResponse create(List<FetchUserLoanBookQueryModel> loanedBooks) {
		return new UserLoanBookResponse(
				loanedBooks.stream()
						.map(UserLoanBookResponseFactory::createLoanHistoryResponseElem)
						.toList()
		);
	}

	private static UserLoanBookResponseElem createLoanHistoryResponseElem(FetchUserLoanBookQueryModel loanedBook) {
		return new UserLoanBookResponseElem(
				loanedBook.getId(),
				loanedBook.getTitle(),
				loanedBook.getAuthorName(),
				loanedBook.getPublisherName(),
				//LocalDateTimeをyyyy-MM-dd hh:mm:ss形式の文字列に変換
				loanedBook.getLoanedAt().format(DATE_TIME_FORMATTER),
				loanedBook.getReturnDueOn().format(DATE_FORMATTER),
				loanedBook.getReturnedAt() == null ? null : loanedBook.getReturnedAt().format(
            DATE_TIME_FORMATTER),
				loanedBook.getLoanStatus(),
				loanedBook.getOverDueDays()
		);
	}
}