package com.example.bookmanager.security.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

@Component
public class LoggingFilter implements Filter {

  private static final Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

  @Override
  public void doFilter(final ServletRequest request, final ServletResponse response,
      final FilterChain chain)
      throws ServletException, IOException {

    final ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(
        (HttpServletRequest) request);
    final ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(
        (HttpServletResponse) response);

    chain.doFilter(requestWrapper, responseWrapper);
    logRequest(requestWrapper);
    logResponse(responseWrapper);
  }

  /**
   * リクエストログを記録
   */
  private void logRequest(ContentCachingRequestWrapper requestWrapper) {

    logger.info("Incoming Request:");

    logger.info("HTTP Method: {}", requestWrapper.getMethod());
    logger.info("Request URI: {}", requestWrapper.getRequestURI());
    logger.info("Query Parameters: {}",
        requestWrapper.getQueryString() != null ? requestWrapper.getQueryString() : "なし");

    if (requestWrapper.getUserPrincipal() != null) {
      logger.info("User: {}", requestWrapper.getUserPrincipal().getName());
    } else {
      logger.info("User: 未認証のリクエスト");
    }

    // `POST` / `PUT` のリクエストボディを取得
    if ("POST".equalsIgnoreCase(requestWrapper.getMethod()) || "PUT".equalsIgnoreCase(
        requestWrapper.getMethod())) {
      final String requestBody = getRequestBody(requestWrapper);
      logger.info("Request Body: {}", requestBody);
    }
  }

  /**
   * レスポンスログを記録
   */
  private void logResponse(ContentCachingResponseWrapper responseWrapper) throws IOException {

    logger.info("Outgoing Response:");

    final int status = responseWrapper.getStatus();
    logger.info("HTTP Status: {}", status);

    // レスポンスボディの取得
    final String responseBody = getResponseBody(responseWrapper);
    logger.info("Response Body: {}", responseBody);

    responseWrapper.copyBodyToResponse();
  }

  /**
   * リクエストボディを取得
   */
  private String getRequestBody(ContentCachingRequestWrapper requestWrapper) {
    byte[] content = requestWrapper.getContentAsByteArray();
    return content.length > 0 ? new String(content, StandardCharsets.UTF_8)
        : "リクエストボディなし";
  }

  /**
   * レスポンスボディを取得
   */
  private String getResponseBody(ContentCachingResponseWrapper responseWrapper) {
    byte[] content = responseWrapper.getContentAsByteArray();
    return content.length > 0 ? new String(content, StandardCharsets.UTF_8)
        : "レスポンスボディなし";
  }
}