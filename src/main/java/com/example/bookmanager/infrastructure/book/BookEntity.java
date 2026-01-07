package com.example.bookmanager.infrastructure.book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "books", schema = "bookmanager")
@Getter
@Setter
public class BookEntity {

  @Id
  private String id;

  private String isbn;

  private String title;

  private String authorId;

  private String publisherId;

  private String genreId;

  private int stock;

  private LocalDate publicationDate;

  private LocalDateTime createdAt;

  private String createdBy;

  private LocalDateTime updatedAt;

  private String updatedBy;

  private int deleted;
}