package com.example.bookmanager.presentation.book.search;

import com.example.bookmanager.presentation.shared.ApiResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SearchBooksResponse implements ApiResponse {

  private final List<SearchBookResponseElem> books;
}