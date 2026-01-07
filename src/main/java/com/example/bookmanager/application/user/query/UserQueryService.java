package com.example.bookmanager.application.user.query;

import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.domain.user.UserId;

public interface UserQueryService {

    /**
     * ユーザーIDに対応するユーザーを取得する
     *
     * @param id ユーザーID
     * @return ユーザー
     */
    SearchUserQueryModel findSearchUserQueryModelById(UserId id);
}