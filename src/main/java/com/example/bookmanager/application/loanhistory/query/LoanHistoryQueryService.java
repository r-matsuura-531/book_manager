package com.example.bookmanager.application.loanhistory.query;

import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookQueryModel;
import com.example.bookmanager.domain.user.UserId;

import java.util.List;

public interface LoanHistoryQueryService {

    /**
     * ユーザーIDに対応する貸出書籍履歴を取得する
     */
    List<FetchUserLoanBookQueryModel> fetchUserLoanBookModel(UserId userId);
}