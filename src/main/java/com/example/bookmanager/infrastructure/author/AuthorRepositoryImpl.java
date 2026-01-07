package com.example.bookmanager.infrastructure.author;

import com.example.bookmanager.domain.author.AuthorId;
import com.example.bookmanager.domain.author.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
class AuthorRepositoryImpl implements AuthorRepository {

  private final AuthorDao authorDao;

  @Override
  public boolean existsById(AuthorId authorId) {
    return authorDao.selectById(authorId).isPresent();
  }
}