package com.example.bookmanager.security;

import com.example.bookmanager.domain.user.User;
import java.util.Collection;
import java.util.List;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class LoginUserDetail implements UserDetails {

  @Getter
  private final User user;
  private final Collection<? extends GrantedAuthority> authorities;

  public LoginUserDetail(
      final User user
  ) {
    this.user = user;
    this.authorities = List.of(
        new SimpleGrantedAuthority(String.format("ROLE_%s", user.getRole().name()))); // 修正
  }

  @Override
  public String getUsername() {
    return user.getEmail();
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  @Override
  public String getPassword() {
    return user.getPassword();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public String getUserId() {
    return user.getId().getValue();
  }

  public Integer getRole() {
    return user.getRole().getValue();
  }
}