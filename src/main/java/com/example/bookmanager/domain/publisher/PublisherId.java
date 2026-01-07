package com.example.bookmanager.domain.publisher;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

/**
 * 出版社ID
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = String.class)
@AllArgsConstructor
public class PublisherId {

  private final String value;
}