package com.example.bookmanager.application.book.command.delete;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeleteBookInput {

  private final String id;
}