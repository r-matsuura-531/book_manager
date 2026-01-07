package com.example.bookmanager.exception;

import com.example.bookmanager.presentation.shared.ApiResponse;
import com.example.bookmanager.presentation.shared.ErrorResponse;
import com.example.bookmanager.presentation.shared.ErrorsResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authorization.AuthorizationDeniedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public void handleException(final Exception ex) {

    logger.error("Exception occurred: {}", ex.getMessage(), ex);
  }

  @ExceptionHandler(AuthorizationDeniedException.class)
  public ResponseEntity<ApiResponse> handleAuthorizationDeniedException(
      final AuthorizationDeniedException ex) {

    logger.error("Authorization denied: message={}", ex.getMessage());
    final ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());

    return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
  }

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ApiResponse> handleResourceNotFoundException(
      final ResourceNotFoundException ex) {

    logger.error("Resource not found: message={}", ex.getMessage());
    final ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());

    return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
  }

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(
      final MethodArgumentNotValidException ex, final @NonNull HttpHeaders headers,
      final @NonNull HttpStatusCode status, final @NonNull WebRequest request) {

    List<Map<String, String>> errors = ex.getBindingResult().getFieldErrors().stream()
        .map(error -> Map.of(
            "field", error.getField(),
            "message",
            Optional.ofNullable(error.getDefaultMessage()).orElse("エラーが発生しました。")
        ))
        .toList();
    logger.error("Validation error: errors={}", errors);
    final ErrorsResponse errorsResponse = new ErrorsResponse(errors);

    return new ResponseEntity<>(errorsResponse, HttpStatus.BAD_REQUEST);
  }

  @Override
  protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
      final @NonNull HttpRequestMethodNotSupportedException ex, final @NonNull HttpHeaders headers,
      final @NonNull HttpStatusCode status, final @NonNull WebRequest request) {

    logger.error("Method not supported: method={}", ex.getMethod());
    final ErrorResponse errorResponse = new ErrorResponse("HTTPメソッドが許可されていません。");

    return new ResponseEntity<>(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
  }
}