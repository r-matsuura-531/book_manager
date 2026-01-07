package com.example.bookmanager.infrastructure.publisher;

import com.example.bookmanager.domain.publisher.PublisherId;
import com.example.bookmanager.domain.publisher.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
class PublisherRepositoryImpl implements PublisherRepository {

  private final PublisherDao publisherDao;

  @Override
  public boolean existsById(PublisherId publisherId) {
    return publisherDao.selectById(publisherId).isPresent();
  }
}