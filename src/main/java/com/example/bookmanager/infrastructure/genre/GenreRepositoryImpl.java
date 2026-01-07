package com.example.bookmanager.infrastructure.genre;

import com.example.bookmanager.domain.genre.GenreId;
import com.example.bookmanager.domain.genre.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
class GenreRepositoryImpl implements GenreRepository {

  private final GenreDao genreDao;

  @Override
  public boolean existsById(GenreId genreId) {
    return genreDao.selectById(genreId).isPresent();
  }
}