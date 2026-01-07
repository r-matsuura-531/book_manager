package com.example.bookmanager.infrastructure.user;

import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
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
public class UserInfrastructureMapperImpl implements UserInfrastructureMapper {

    @Override
    public SearchUserQueryModel toSearchUserQueryModel(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String lastName = null;
        String firstName = null;
        String email = null;

        id = entity.getId();
        lastName = entity.getLastName();
        firstName = entity.getFirstName();
        email = entity.getEmail();

        String role = mapUserRoleToString(entity.getRole());

        SearchUserQueryModel searchUserQueryModel = new SearchUserQueryModel( id, lastName, firstName, email, role );

        return searchUserQueryModel;
    }

    @Override
    public List<SearchUserQueryModel> toSearchUserQueryModel(List<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SearchUserQueryModel> list = new ArrayList<SearchUserQueryModel>( entities.size() );
        for ( UserEntity userEntity : entities ) {
            list.add( toSearchUserQueryModel( userEntity ) );
        }

        return list;
    }
}
