package com.example.bookmanager.application.book.command.create;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateBookInput {

  private final String id;
  private final String isbn;
  private final String title;
  private final String authorId;
  private final String publisherId;
  private final String genreId;
  private final int stock;
  private final LocalDate publicationDate;
}