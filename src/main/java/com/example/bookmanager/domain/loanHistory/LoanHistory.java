package com.example.bookmanager.domain.loanHistory;

import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.user.UserId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoanHistory {

    private final LoanHistoryId id;

    private final BookId bookId;

    private final UserId userId;

    private final LoanedAt loanedAt;

    private final ReturnDueOn returnDueOn;

    private final ReturnedAt returnedAt;

    public boolean isReturned() {
        return this.returnedAt.isEmpty();
    }

    public boolean isLoanedBy(final UserId userId) {
        return this.userId.equals(userId);
    }

    /**
     * DBのデータの復元用のファクトリメソッド
     */
    public static LoanHistory restore(
            final LoanHistoryId id,
            final BookId bookId,
            final UserId userId,
            final LoanedAt loanedAt,
            final ReturnDueOn returnDueOn,
            final ReturnedAt returnedAt) {

        return new LoanHistory(id, bookId, userId, loanedAt, returnDueOn, returnedAt);
    }

    /**
     * 新規登録用のファクトリメソッド
     *
     * @param bookId      書籍ID
     * @param userId      ユーザID
     * @param returnDueOn 返却期限日
     * @return 書籍貸し出し履歴
     */
    public static LoanHistory createNewLoanHistory(
            final BookId bookId,
            final UserId userId,
            final LoanedAt loanedAt,
            final ReturnDueOn returnDueOn) {

        final LoanHistoryId id = new LoanHistoryId(java.util.UUID.randomUUID().toString());

        return new LoanHistory(id, bookId, userId, loanedAt, returnDueOn, ReturnedAt.empty());
    }

    /**
     * 返却済みの貸出履歴を作成する
     *
     * @return 書籍貸し出し履歴
     */
    public LoanHistory createReturnedLoanHistory() {

        return new LoanHistory(
                this.id,
                this.bookId,
                this.userId,
                this.loanedAt,
                this.returnDueOn,
                new ReturnedAt(LocalDateTime.now())
        );
    }

}
