package com.example.bookmanager.presentation.book.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateBookRequest {

  @NotBlank(message = "{VLD-REQUIRED}")
  private String isbn;

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

  @NotBlank(message = "{VLD-REQUIRED}")
  @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "{VLD-INVALID-FORMAT}")
  private String publicationDate;
}