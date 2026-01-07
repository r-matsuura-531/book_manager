package com.example.bookmanager.application.loanhistory.query.loanbook;

import com.example.bookmanager.application.loanhistory.query.LoanHistoryQueryService;
import com.example.bookmanager.domain.user.UserId;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FetchUserLoanBookUseCase {

    private final LoanHistoryQueryService loanHistoryQueryService;

    /**
     * ユーザーIDに対応する書籍貸し出し履歴を取得する
     *
     * @param id ユーザーID
     * @return ユーザー
     */
    public List<FetchUserLoanBookQueryModel> exezcute(UserId id) {
        return loanHistoryQueryService.fetchUserLoanBookModel(id);
    }

}
