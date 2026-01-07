package com.example.bookmanager.presentation.book.update;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UpdateBookRequest {

  @NotBlank
  @Size(min = 1, max = 255, message = "VLD-INVALID-LENGTH")
  private String title;

  @NotBlank(message = "{VLD-REQUIRED}")
  private String authorId;

  @NotBlank(message = "{VLD-REQUIRED}")
  private String publisherId;

  @NotBlank(message = "{VLD-REQUIRED}")
  private String genreId;

  @Min(value = 0, message = "{VLD-REQUIRED}")
  private int stock;
}