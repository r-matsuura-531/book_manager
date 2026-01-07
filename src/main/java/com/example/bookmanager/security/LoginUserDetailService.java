package com.example.bookmanager.security;

import com.example.bookmanager.domain.user.User;
import com.example.bookmanager.domain.user.UserRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
public class LoginUserDetailService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
    final User user = Optional.ofNullable(userRepository.findByEmail(email))
        .orElseThrow(() -> new UsernameNotFoundException("User not found."));
    return new LoginUserDetail(user);
  }
}