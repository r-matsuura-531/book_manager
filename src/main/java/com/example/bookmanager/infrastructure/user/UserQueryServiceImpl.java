package com.example.bookmanager.infrastructure.user;

import com.example.bookmanager.application.user.query.UserQueryService;
import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
class UserQueryServiceImpl implements UserQueryService {

    private final UserDao userDao;
    private final LoanHistoryDao loanHistoryDao;
    private final MessageHelper messageHelper;
    private final UserInfrastructureMapper bookInfrastructureMapper;

    @Override
    public SearchUserQueryModel findSearchUserQueryModelById(UserId id) {
        return userDao.selectById(id.getValue())
                .map(bookInfrastructureMapper::toSearchUserQueryModel)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                messageHelper.getMessageForResourceNotFound(new String[]{id.getValue()}))
                );
    }

}