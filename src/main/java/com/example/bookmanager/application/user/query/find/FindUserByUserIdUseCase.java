package com.example.bookmanager.application.user.query.find;

import com.example.bookmanager.application.user.query.UserQueryService;
import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.domain.user.UserId;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FindUserByUserIdUseCase {

    private final UserQueryService userQueryService;

    /**
     * ユーザーIDに対応するユーザーを取得する
     *
     * @param id ユーザーID
     * @return ユーザー
     */
    public SearchUserQueryModel execute(UserId id) {
        return userQueryService.findSearchUserQueryModelById(id);
    }

}
