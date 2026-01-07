package com.example.bookmanager.presentation.book.search;

import com.example.bookmanager.presentation.shared.ApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SearchBookResponseElem implements ApiResponse {

    private String id;

    private String isbn;

    private String title;

    private String authorName;

    private String publisherName;

    private String genreName;

    private Integer stock;

    private LocalDate publicationDate;
}