package com.example.bookmanager.presentation.book.search;

import lombok.Data;

@Data
public class SearchBookRequest {

    private String isbn;

    private String title;

    private String authorName;

    private String publisherId;

    private String genreId;

}