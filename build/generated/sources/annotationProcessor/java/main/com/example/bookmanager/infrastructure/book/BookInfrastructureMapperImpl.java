package com.example.bookmanager.infrastructure.book;

import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-08T01:49:38+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 21.0.7 (Amazon.com Inc.)"
)
@Component
public class BookInfrastructureMapperImpl implements BookInfrastructureMapper {

    @Override
    public SearchBookQueryModel toSearchBookQueryModel(SearchBookEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String isbn = null;
        String title = null;
        String authorName = null;
        String publisherName = null;
        String genreName = null;
        Integer stock = null;
        LocalDate publicationDate = null;

        id = entity.getId();
        isbn = entity.getIsbn();
        title = entity.getTitle();
        authorName = entity.getAuthorName();
        publisherName = entity.getPublisherName();
        genreName = entity.getGenreName();
        stock = entity.getStock();
        publicationDate = entity.getPublicationDate();

        SearchBookQueryModel searchBookQueryModel = new SearchBookQueryModel( id, isbn, title, authorName, publisherName, genreName, stock, publicationDate );

        return searchBookQueryModel;
    }

    @Override
    public List<SearchBookQueryModel> toSearchBookQueryModel(List<SearchBookEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SearchBookQueryModel> list = new ArrayList<SearchBookQueryModel>( entities.size() );
        for ( SearchBookEntity searchBookEntity : entities ) {
            list.add( toSearchBookQueryModel( searchBookEntity ) );
        }

        return list;
    }
}
