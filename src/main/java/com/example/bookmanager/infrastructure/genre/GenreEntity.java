package com.example.bookmanager.infrastructure.genre;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "genres", schema = "bookmanager")
@Getter
@Setter
public class GenreEntity {

  private String id;

  private String name;
}