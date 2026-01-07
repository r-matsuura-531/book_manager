package com.example.bookmanager.infrastructure.loanhistory;

import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.loanHistory.LoanHistoryId;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;
import java.util.Optional;

@Dao
@ConfigAutowireable
public interface LoanHistoryDao {

    /**
     * 書籍貸し出し履歴をIDで取得する
     */
    @Select
    Optional<LoanHistoryEntity> selectById(LoanHistoryId loanHistoryId);

    /**
     * 書籍貸し出し履歴を登録する
     */
    @Insert(excludeNull = true)
    int insert(LoanHistoryEntity loanHistoryEntity);

    /**
     * 指定のユーザーIDの貸し出し履歴を取得する
     */
    @Select
    List<UserLoanBookEntity> selectByUserId(UserId userId);

    /**
     * 貸し出し履歴を更新する
     */
    @Update(excludeNull = true)
    int update(LoanHistoryEntity loanHistoryEntity);

    /**
     * 指定の書籍IDで貸し出し中の履歴を取得する
     */
    @Select
    List<LoanHistoryEntity> selectByBookId(BookId bookId);
}
