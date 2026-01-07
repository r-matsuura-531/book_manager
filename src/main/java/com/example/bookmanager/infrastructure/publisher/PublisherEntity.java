package com.example.bookmanager.infrastructure.publisher;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "publishers", schema = "bookmanager")
@Getter
@Setter
public class PublisherEntity {

  private String id;

  private String name;
}