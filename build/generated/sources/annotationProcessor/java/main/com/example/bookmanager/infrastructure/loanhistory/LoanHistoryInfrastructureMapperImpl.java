package com.example.bookmanager.infrastructure.loanhistory;

import com.example.bookmanager.application.loanhistory.query.loanbook.FetchUserLoanBookQueryModel;
import com.example.bookmanager.domain.loanHistory.LoanHistory;
import com.example.bookmanager.domain.loanHistory.loanbook.UserLoanBook;
import com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-08T01:49:38+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class LoanHistoryInfrastructureMapperImpl implements LoanHistoryInfrastructureMapper {

    @Override
    public List<UserLoanBook> toUserLoanBook(List<UserLoanBookEntity> userLoanBookEntities) {
        if ( userLoanBookEntities == null ) {
            return null;
        }

        List<UserLoanBook> list = new ArrayList<UserLoanBook>( userLoanBookEntities.size() );
        for ( UserLoanBookEntity userLoanBookEntity : userLoanBookEntities ) {
            list.add( toUserLoanBook( userLoanBookEntity ) );
        }

        return list;
    }

    @Override
    public List<FetchUserLoanBookQueryModel> toFetchUserLoanBookQueryModel(List<UserLoanBook> userLoanBooks) {
        if ( userLoanBooks == null ) {
            return null;
        }

        List<FetchUserLoanBookQueryModel> list = new ArrayList<FetchUserLoanBookQueryModel>( userLoanBooks.size() );
        for ( UserLoanBook userLoanBook : userLoanBooks ) {
            list.add( toFetchUserLoanBookQueryModel( userLoanBook ) );
        }

        return list;
    }

    @Override
    public List<LoanHistory> toLoanHistory(List<LoanHistoryEntity> loanHistoryEntities) {
        if ( loanHistoryEntities == null ) {
            return null;
        }

        List<LoanHistory> list = new ArrayList<LoanHistory>( loanHistoryEntities.size() );
        for ( LoanHistoryEntity loanHistoryEntity : loanHistoryEntities ) {
            list.add( toLoanHistory( loanHistoryEntity ) );
        }

        return list;
    }
}
