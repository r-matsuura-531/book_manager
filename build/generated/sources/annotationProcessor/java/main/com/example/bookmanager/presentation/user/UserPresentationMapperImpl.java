package com.example.bookmanager.presentation.user;

import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.presentation.user.search.SearchUserResponseElem;
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
public class UserPresentationMapperImpl implements UserPresentationMapper {

    @Override
    public SearchUserResponseElem toSearchResponse(SearchUserQueryModel output) {
        if ( output == null ) {
            return null;
        }

        String id = null;
        String lastName = null;
        String firstName = null;
        String email = null;
        String role = null;

        id = output.getId();
        lastName = output.getLastName();
        firstName = output.getFirstName();
        email = output.getEmail();
        role = output.getRole();

        SearchUserResponseElem searchUserResponseElem = new SearchUserResponseElem( id, lastName, firstName, email, role );

        return searchUserResponseElem;
    }

    @Override
    public List<SearchUserResponseElem> toSearchResponses(List<SearchUserQueryModel> outputs) {
        if ( outputs == null ) {
            return null;
        }

        List<SearchUserResponseElem> list = new ArrayList<SearchUserResponseElem>( outputs.size() );
        for ( SearchUserQueryModel searchUserQueryModel : outputs ) {
            list.add( toSearchResponse( searchUserQueryModel ) );
        }

        return list;
    }
}
