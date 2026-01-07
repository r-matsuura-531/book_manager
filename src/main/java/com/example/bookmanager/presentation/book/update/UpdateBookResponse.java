package com.example.bookmanager.presentation.book.update;

import com.example.bookmanager.presentation.shared.ApiResponse;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UpdateBookResponse implements ApiResponse {

  private final String isbn;

  private final String title;

  private final String authorId;

  private final String publisherId;

  private final String genreId;

  private final int stock;

  private final LocalDate publicationDate;
}