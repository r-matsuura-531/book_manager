package com.example.bookmanager.application.book.query.search;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SearchBookQueryModel {

    private final String id;

    private final String isbn;

    private final String title;

    private final String authorName;

    private final String publisherName;

    private final String genreName;

    private final Integer stock;

    private final LocalDate publicationDate;
}