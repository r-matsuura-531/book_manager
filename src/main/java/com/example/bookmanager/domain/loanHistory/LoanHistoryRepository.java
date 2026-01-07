package com.example.bookmanager.domain.loanHistory;

import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.user.UserId;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanHistoryRepository {

    LoanHistory findById(LoanHistoryId id);

    void register(LoanHistory loanHistory, UserId userId);

    void update(LoanHistory loanHistory, UserId userId);

    LoanHistoryCollection findByBookId(BookId bookId);
}