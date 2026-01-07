package com.example.bookmanager.application.book.command.update;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UpdateBookInput {

  private final String id;

  private final String title;

  private final String authorId;

  private final String publisherId;

  private final String genreId;

  private final int stock;
}