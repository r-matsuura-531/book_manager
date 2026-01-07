package com.example.bookmanager.infrastructure.book;

import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.domain.book.BookId;
import java.util.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface BookInfrastructureMapper {

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  SearchBookQueryModel toSearchBookQueryModel(SearchBookEntity entity);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  List<SearchBookQueryModel> toSearchBookQueryModel(List<SearchBookEntity> entities);

  default BookId map(String id) {
    return new BookId(id);
  }
}