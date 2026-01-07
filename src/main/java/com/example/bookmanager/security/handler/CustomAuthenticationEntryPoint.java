package com.example.bookmanager.security.handler;

import com.example.bookmanager.presentation.shared.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration(proxyBeanMethods = false)
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void commence(final HttpServletRequest request, final HttpServletResponse response,
      AuthenticationException authException) throws IOException {
    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");

    final ErrorResponse errorResponse = new ErrorResponse(authException.getMessage());
    response.getWriter().write(objectMapper.writeValueAsString(errorResponse));
  }
}