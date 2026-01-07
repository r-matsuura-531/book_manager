package com.example.bookmanager.infrastructure.user;

import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.domain.user.User;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.domain.user.UserRepository;
import com.example.bookmanager.domain.user.UserRole;
import com.example.bookmanager.exception.ResourceNotFoundException;
import com.example.bookmanager.infrastructure.helper.RepositoryHelper;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
class UserRepositoryImpl implements UserRepository {

  private final UserDao userDao;
  private final MessageHelper messageHelper;
  private final RepositoryHelper repositoryHelper;

  @Override
  public User findByEmail(final String email) {
    final UserEntity entity = userDao.selectByEmail(email)
        .orElseThrow(
            () -> new ResourceNotFoundException(
                messageHelper.getMessageForResourceNotFound(new String[]{email}))
        );

    return User.restore(
        new UserId(entity.getId()),
        entity.getLastName(),
        entity.getFirstName(),
        entity.getEmail(),
        entity.getPassword(),
        UserRole.of(entity.getRole())
    );
  }

  @Override
  public boolean existsByEmail(String email) {
    return userDao.selectByEmail(email).isPresent();
  }

  @Override
  public void register(final User user) {
    final UserEntity userEntity = new UserEntity();
    userEntity.setId(user.getId().getValue());
    userEntity.setLastName(user.getLastName());
    userEntity.setFirstName(user.getFirstName());
    userEntity.setEmail(user.getEmail());
    userEntity.setRole(user.getRole().getValue());
    userEntity.setPassword(user.getPassword());
    userEntity.setCreatedAt(LocalDateTime.now());
    userEntity.setUpdatedAt(LocalDateTime.now());
    userEntity.setCreatedBy("system");
    userEntity.setUpdatedBy("system");

    final int insertCount = userDao.insert(userEntity);

    repositoryHelper.verifyExpectedRowCount(1, insertCount);
  }
}