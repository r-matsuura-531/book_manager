package com.example.bookmanager.infrastructure.book;

import com.example.bookmanager.application.book.query.BookQueryService;
import com.example.bookmanager.application.book.query.search.SearchBookFilter;
import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.common.helper.MessageHelper;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.exception.ResourceNotFoundException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class BookQueryServiceImpl implements BookQueryService {

  private final BookDao bookDao;
  private final BookInfrastructureMapper bookInfrastructureMapper;
  private final MessageHelper messageHelper;

  @Override
  public SearchBookQueryModel findSearchBookQueryModelById(final BookId id) {

    return bookDao.selectQueryModelByBookId(id)
        .map(bookInfrastructureMapper::toSearchBookQueryModel)
        .orElseThrow(
            () -> new ResourceNotFoundException(
                messageHelper.getMessageForResourceNotFound(new String[]{id.getValue()}))
        );
  }

  @Override
  public List<SearchBookQueryModel> SearchBookQueryModel(final SearchBookFilter filter) {
    final List<SearchBookEntity> bookList = bookDao.selectQueryModelByConditions(filter);
    return bookInfrastructureMapper.toSearchBookQueryModel(bookList);
  }
}