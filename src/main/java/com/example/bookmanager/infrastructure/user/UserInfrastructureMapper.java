package com.example.bookmanager.infrastructure.user;

import com.example.bookmanager.application.user.query.search.SearchUserQueryModel;
import com.example.bookmanager.domain.user.UserId;
import java.util.List;
import com.example.bookmanager.domain.user.UserRole;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UserInfrastructureMapper {

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(target = "role", expression = "java(mapUserRoleToString(entity.getRole()))")
  SearchUserQueryModel toSearchUserQueryModel(UserEntity entity);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  List<SearchUserQueryModel> toSearchUserQueryModel(List<UserEntity> entities);

  default UserId map(String id) {
    return new UserId(id);
  }

  default String mapUserRoleToString(Integer value) {
    return UserRole.of(value).getLabel();
  }
}