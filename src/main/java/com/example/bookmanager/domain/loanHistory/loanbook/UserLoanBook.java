package com.example.bookmanager.domain.loanHistory.loanbook;

import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.book.LoanStatus;
import com.example.bookmanager.domain.book.OverDueDays;
import com.example.bookmanager.domain.loanHistory.LoanedAt;
import com.example.bookmanager.domain.loanHistory.ReturnDueOn;
import com.example.bookmanager.domain.loanHistory.ReturnedAt;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 貸出中の書籍
 */
@Getter
@AllArgsConstructor
public class UserLoanBook {

	private final BookId id;

	private final String title;

	private final String authorName;

	private final String publisherName;

	private final LoanedAt loanedAt;

	private final ReturnDueOn returnDueOn;

	private final ReturnedAt returnedAt;

	public LoanStatus getLoanStatus() {
		if (returnedAt.isEmpty()) {
			return LoanStatus.RETURNED;
		}

		return LoanStatus.LOANED;
	}

	public OverDueDays getOverDueDays() {
		return OverDueDays.calculateFrom(getLoanStatus(), returnDueOn);
	}

	public static UserLoanBook createUserLoanBook(
			String id,
			String title,
			String authorName,
			String publisherName,
			LocalDateTime loanedAt,
			LocalDate returnDueOn,
			LocalDateTime returnedAt) {

		return new UserLoanBook(
				new BookId(id),
				title,
				authorName,
				publisherName,
				new LoanedAt(loanedAt),
				new ReturnDueOn(returnDueOn),
				new ReturnedAt(returnedAt)
		);
	}
}
