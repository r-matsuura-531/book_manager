package com.example.bookmanager.infrastructure.loanhistory;

import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.domain.loanHistory.*;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.infrastructure.helper.RepositoryHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class LoanHistoryRepositoryImpl implements LoanHistoryRepository {

    private final LoanHistoryDao loanHistoryDao;
    private final LoanHistoryInfrastructureMapper loanHistoryInfrastructureMapper;
    private final MessageHelper messageHelper;
    private final RepositoryHelper repositoryHelper;

    @Override
    public LoanHistory findById(LoanHistoryId id) {
        return loanHistoryDao.selectById(id)
                .map(
                        loanHistoryEntity -> LoanHistory.restore(
                                new LoanHistoryId(loanHistoryEntity.getId()),
                                new BookId(loanHistoryEntity.getBookId()),
                                new UserId(loanHistoryEntity.getUserId()),
                                new LoanedAt(loanHistoryEntity.getLoanedAt()),
                                new ReturnDueOn(loanHistoryEntity.getReturnDueOn()),
                                new ReturnedAt(loanHistoryEntity.getReturnedAt())
                        ))
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                messageHelper.getMessageForResourceNotFound(new String[]{id.getValue()}))
                );
    }

    @Override
    public void register(final LoanHistory loanHistory, final UserId userId) {
        final LoanHistoryEntity loanHistoryEntity = toEntityForCreate(loanHistory, userId);
        final int insertCount = loanHistoryDao.insert(loanHistoryEntity);

        repositoryHelper.verifyExpectedRowCount(1, insertCount);
    }

    @Override
    public void update(LoanHistory loanHistory, UserId userId) {
        final LoanHistoryEntity loanHistoryEntity = toEntityForUpdate(loanHistory, userId);
        final int updateCount = loanHistoryDao.update(loanHistoryEntity);

        repositoryHelper.verifyExpectedRowCount(1, updateCount);
    }

    @Override
    public LoanHistoryCollection findByBookId(BookId bookId) {
        List<LoanHistoryEntity> loanHistoryEntities = loanHistoryDao.selectByBookId(bookId);
        return new LoanHistoryCollection(loanHistoryInfrastructureMapper.toLoanHistory(loanHistoryEntities));
    }

    private LoanHistoryEntity toEntityForCreate(final LoanHistory loanHistory, final UserId userId) {
        final LoanHistoryEntity entity = new LoanHistoryEntity();
        entity.setId(loanHistory.getId().getValue());
        entity.setBookId(loanHistory.getBookId().getValue());
        entity.setUserId(loanHistory.getUserId().getValue());
        entity.setLoanedAt(loanHistory.getLoanedAt().getValue());
        entity.setReturnDueOn(loanHistory.getReturnDueOn().getValue());
        entity.setReturnedAt(loanHistory.getReturnedAt().getValue());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setCreatedBy(userId.getValue());

        return entity;
    }

    private LoanHistoryEntity toEntityForUpdate(final LoanHistory loanHistory, final UserId userId) {
        final LoanHistoryEntity entity = new LoanHistoryEntity();
        entity.setId(loanHistory.getId().getValue());
        entity.setBookId(loanHistory.getBookId().getValue());
        entity.setUserId(loanHistory.getUserId().getValue());
        entity.setLoanedAt(loanHistory.getLoanedAt().getValue());
        entity.setReturnDueOn(loanHistory.getReturnDueOn().getValue());
        entity.setReturnedAt(loanHistory.getReturnedAt().getValue());
        entity.setUpdatedAt(LocalDateTime.now());
        entity.setUpdatedBy(userId.getValue());

        return entity;
    }
}
