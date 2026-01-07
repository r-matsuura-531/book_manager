package com.example.bookmanager.infrastructure.loanhistory;

import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookQueryModel;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.loanHistory.*;
import com.example.bookmanager.domain.loanHistory.loanbook.UserLoanBook;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LoanHistoryInfrastructureMapper {

    default UserLoanBook toUserLoanBook(UserLoanBookEntity userLoanBookEntity) {
        return UserLoanBook.createUserLoanBook(
                userLoanBookEntity.getId(),
                userLoanBookEntity.getTitle(),
                userLoanBookEntity.getAuthorName(),
                userLoanBookEntity.getPublisherName(),
                userLoanBookEntity.getLoanedAt(),
                userLoanBookEntity.getReturnDueOn(),
                userLoanBookEntity.getReturnedAt()
        );
    }

    List<UserLoanBook> toUserLoanBook(List<UserLoanBookEntity> userLoanBookEntities);

    default FetchUserLoanBookQueryModel toFetchUserLoanBookQueryModel(UserLoanBook userLoanBook) {
        return new FetchUserLoanBookQueryModel(
                userLoanBook.getId().getValue(),
                userLoanBook.getTitle(),
                userLoanBook.getAuthorName(),
                userLoanBook.getPublisherName(),
                userLoanBook.getLoanedAt().getValue(),
                userLoanBook.getReturnDueOn().getValue(),
                userLoanBook.getReturnedAt().getValue(),
                userLoanBook.getLoanStatus().getLabel(),
                userLoanBook.getOverDueDays().getValue()
        );
    }

    List<FetchUserLoanBookQueryModel> toFetchUserLoanBookQueryModel(List<UserLoanBook> userLoanBooks);

    default LoanHistory toLoanHistory(LoanHistoryEntity loanHistoryEntity) {
        return LoanHistory.restore(
                new LoanHistoryId(loanHistoryEntity.getId()),
                new BookId(loanHistoryEntity.getBookId()),
                new UserId(loanHistoryEntity.getUserId()),
                new LoanedAt(loanHistoryEntity.getLoanedAt()),
                new ReturnDueOn(loanHistoryEntity.getReturnDueOn()),
                new ReturnedAt(loanHistoryEntity.getReturnedAt())
        );
    }

    List<LoanHistory> toLoanHistory(List<LoanHistoryEntity> loanHistoryEntities);
}