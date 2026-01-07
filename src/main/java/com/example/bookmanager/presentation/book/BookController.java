package com.example.bookmanager.presentation.book;

import com.example.bookmanager.application.book.command.create.CreateBookInput;
import com.example.bookmanager.application.book.command.create.CreateBookUseCase;
import com.example.bookmanager.application.book.command.delete.DeleteBookInput;
import com.example.bookmanager.application.book.command.delete.DeleteBookUseCase;
import com.example.bookmanager.application.book.command.update.UpdateBookInput;
import com.example.bookmanager.application.book.command.update.UpdateBookUseCase;
import com.example.bookmanager.application.book.query.find.FindBookByBookIdUseCase;
import com.example.bookmanager.application.book.query.search.SearchBookFilter;
import com.example.bookmanager.application.book.query.search.SearchBookQueryModel;
import com.example.bookmanager.application.book.query.search.SearchBookUseCase;
import com.example.bookmanager.domain.book.BookId;
import com.example.bookmanager.exception.CanNotDeleteBookException;
import com.example.bookmanager.exception.DuplicateValueException;
import com.example.bookmanager.exception.InvalidValueObjectException;
import com.example.bookmanager.presentation.book.create.CreateBookRequest;
import com.example.bookmanager.presentation.book.search.SearchBookRequest;
import com.example.bookmanager.presentation.book.search.SearchBooksResponse;
import com.example.bookmanager.presentation.book.update.UpdateBookRequest;
import com.example.bookmanager.presentation.shared.ApiResponse;
import com.example.bookmanager.presentation.shared.ErrorsResponse;
import com.example.bookmanager.security.LoginUserDetail;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final CreateBookUseCase createBookUsecase;
    private final UpdateBookUseCase updateBookUsecase;
    private final DeleteBookUseCase deleteBookUsecase;
    private final FindBookByBookIdUseCase findBookByBookIdUseCase;
    private final SearchBookUseCase searchBookUseCase;
    private final BookPresentationMapper bookPresentationMapper;

    /**
     * 書籍を登録する
     *
     * @param request         登録する書籍データ
     * @param loginUserDetail ログイン中のユーザーデータ
     * @return 登録結果
     */
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ApiResponse> create(
            @Validated @RequestBody final CreateBookRequest request,
            @AuthenticationPrincipal final LoginUserDetail loginUserDetail) {

        final CreateBookInput input = CreateBookInput.builder().isbn(request.getIsbn())
                .title(request.getTitle()).authorId(request.getAuthorId())
                .publisherId(request.getPublisherId()).genreId(request.getGenreId())
                .stock(request.getStock()).publicationDate(LocalDate.parse(request.getPublicationDate()))
                .build();

        try {
            final BookId bookId = createBookUsecase.handle(input, loginUserDetail);
            final SearchBookQueryModel queryModel = findBookByBookIdUseCase.handle(bookId);
            return ResponseEntity.ok(bookPresentationMapper.toSearchResponse(queryModel));

        } catch (InvalidValueObjectException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        } catch (DuplicateValueException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        }
    }

    /**
     * 書籍を編集する
     *
     * @param id              編集する書籍ID
     * @param request         編集する書籍データ
     * @param loginUserDetail ログイン中のユーザーデータ
     * @return 編集結果
     */
    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ApiResponse> update(
            @PathVariable("id") String id,
            @Validated @RequestBody final UpdateBookRequest request,
            @AuthenticationPrincipal final LoginUserDetail loginUserDetail) {

        final UpdateBookInput input = UpdateBookInput.builder().id(id).title(request.getTitle())
                .authorId(request.getAuthorId()).publisherId(request.getPublisherId())
                .genreId(request.getGenreId()).stock(request.getStock()).build();

        try {
            updateBookUsecase.handle(input, loginUserDetail);
        } catch (InvalidValueObjectException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        }

        final SearchBookQueryModel queryModel = findBookByBookIdUseCase.handle(new BookId(id));

        return ResponseEntity.ok(bookPresentationMapper.toSearchResponse(queryModel));
    }

    /**
     * 書籍検索
     *
     * @param request 検索条件
     * @return 検索結果
     */
    @GetMapping()
    public ResponseEntity<ApiResponse> search(final SearchBookRequest request) {

        final SearchBookFilter filter = SearchBookFilter.builder().isbn(request.getIsbn())
                .title(request.getTitle()).authorName(request.getAuthorName())
                .publisherId(request.getPublisherId()).genreId(request.getGenreId()).build();

        final List<SearchBookQueryModel> queryModels = searchBookUseCase.handle(filter);
        final SearchBooksResponse booksResponse = new SearchBooksResponse(
                bookPresentationMapper.toSearchResponses(queryModels));

        return ResponseEntity.ok(booksResponse);
    }

    /**
     * 書籍を削除する
     *
     * @param id              削除する書籍ID
     * @param loginUserDetail ログイン中のユーザーデータ
     * @return 削除結果
     */
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ApiResponse> delete(
            @PathVariable("id") String id,
            @AuthenticationPrincipal final LoginUserDetail loginUserDetail) {

        final DeleteBookInput input = DeleteBookInput.builder().id(id).build();

        try {
            deleteBookUsecase.handle(input, loginUserDetail);
        } catch (CanNotDeleteBookException e) {
            return ResponseEntity.badRequest()
                    .body(new ErrorsResponse(List.of(Map.of(e.getField(), e.getMessage()))));
        }

        return ResponseEntity.ok().build();
    }
}
