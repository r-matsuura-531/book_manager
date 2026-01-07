package com.example.bookmanager.infrastructure.author;


import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "authors", schema = "bookmanager")
@Getter
@Setter
public class AuthorEntity {

  private String id;

  private String name;
}