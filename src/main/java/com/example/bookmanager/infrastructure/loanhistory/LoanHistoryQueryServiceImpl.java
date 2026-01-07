package com.example.bookmanager.infrastructure.loanhistory;

import com.example.bookmanager.application.loanhistory.query.LoanHistoryQueryService;
import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookQueryModel;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.domain.loanHistory.loanbook.UserLoanBook;
import com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
class LoanHistoryQueryServiceImpl implements LoanHistoryQueryService {

    private final LoanHistoryDao loanHistoryDao;
    private final LoanHistoryInfrastructureMapper loanHistoryInfrastructureMapper;

    @Override
    public List<FetchUserLoanBookQueryModel> fetchUserLoanBookModel(UserId userId) {
        final List<UserLoanBookEntity> loanBookHistoryList = loanHistoryDao.selectByUserId(userId);

        final List<UserLoanBook> userLoanedBookList = loanHistoryInfrastructureMapper.toUserLoanBook(loanBookHistoryList);

        return loanHistoryInfrastructureMapper.toFetchUserLoanBookQueryModel(userLoanedBookList);
    }
}