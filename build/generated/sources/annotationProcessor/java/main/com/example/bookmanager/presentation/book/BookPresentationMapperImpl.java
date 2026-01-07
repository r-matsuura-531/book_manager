package com.example.bookmanager.presentation.book;

import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.presentation.book.search.SearchBookResponseElem;
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
public class BookPresentationMapperImpl implements BookPresentationMapper {

    @Override
    public SearchBookResponseElem toSearchResponse(SearchBookQueryModel output) {
        if ( output == null ) {
            return null;
        }

        SearchBookResponseElem searchBookResponseElem = new SearchBookResponseElem();

        searchBookResponseElem.setId( output.getId() );
        searchBookResponseElem.setIsbn( output.getIsbn() );
        searchBookResponseElem.setTitle( output.getTitle() );
        searchBookResponseElem.setAuthorName( output.getAuthorName() );
        searchBookResponseElem.setPublisherName( output.getPublisherName() );
        searchBookResponseElem.setGenreName( output.getGenreName() );
        searchBookResponseElem.setStock( output.getStock() );
        searchBookResponseElem.setPublicationDate( output.getPublicationDate() );

        return searchBookResponseElem;
    }

    @Override
    public List<SearchBookResponseElem> toSearchResponses(List<SearchBookQueryModel> outputs) {
        if ( outputs == null ) {
            return null;
        }

        List<SearchBookResponseElem> list = new ArrayList<SearchBookResponseElem>( outputs.size() );
        for ( SearchBookQueryModel searchBookQueryModel : outputs ) {
            list.add( toSearchResponse( searchBookQueryModel ) );
        }

        return list;
    }
}
