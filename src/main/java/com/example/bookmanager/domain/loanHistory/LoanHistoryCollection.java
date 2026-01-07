package com.example.bookmanager.domain.loanHistory;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class LoanHistoryCollection {

    private final List<LoanHistory> loanHistories;

    public boolean hasUnreturnedLoan() {

        if (loanHistories.isEmpty()) {
            return false;
        }

        return loanHistories.stream().anyMatch(loanHistory -> !loanHistory.isReturned());
    }
}
