package com.example.bookmanager.security;

import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

@RequiredArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class SecurityLoggingUtil {

  private static final Logger logger = LoggerFactory.getLogger(SecurityLoggingUtil.class);

  public static void logAuthentication() {
    final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication != null && authentication.isAuthenticated()) {
      logger.info("User: {}", authentication.getName());
      final String roles = authentication.getAuthorities().stream()
          .map(GrantedAuthority::getAuthority)
          .collect(Collectors.joining(", "));
      logger.info("Roles: {}", roles);
    } else {
      logger.warn("Unauthenticated access attempt");
    }
  }
}