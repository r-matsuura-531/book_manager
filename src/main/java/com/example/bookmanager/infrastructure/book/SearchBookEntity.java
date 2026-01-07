package com.example.bookmanager.infrastructure.book;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Getter
@Setter
public class SearchBookEntity extends BookEntity {

    private String authorName;

    private String publisherName;

    private String genreName;
}