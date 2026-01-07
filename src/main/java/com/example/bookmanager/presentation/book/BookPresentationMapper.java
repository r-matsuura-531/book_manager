package com.example.bookmanager.presentation.book;

import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.presentation.book.search.SearchBookResponseElem;
import java.util.List;
import org.mapstruct.Mapper;

/**
 * プレゼンテーション層 <-> アプリケーション層 のマッピングを行う
 */
@Mapper(componentModel = "spring")
public interface BookPresentationMapper {

  SearchBookResponseElem toSearchResponse(SearchBookQueryModel output);

  List<SearchBookResponseElem> toSearchResponses(List<SearchBookQueryModel> outputs);
}