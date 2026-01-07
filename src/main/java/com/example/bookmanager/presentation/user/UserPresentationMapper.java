package com.example.bookmanager.presentation.user;

import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.presentation.user.search.SearchUserResponseElem;
import java.util.List;
import org.mapstruct.Mapper;

/**
 * プレゼンテーション層 <-> アプリケーション層 のマッピングを行う
 */
@Mapper(componentModel = "spring")
public interface UserPresentationMapper {

  SearchUserResponseElem toSearchResponse(SearchUserQueryModel output);

  List<SearchUserResponseElem> toSearchResponses(List<SearchUserQueryModel> outputs);
}