package com.example.bookmanager.application.user.command.create;

import com.example.bookmanager.domain.user.EmailDuplicateChecker;
import com.example.bookmanager.domain.user.User;
import com.example.bookmanager.domain.user.UserId;
import com.example.bookmanager.domain.user.UserRepository;
import com.example.bookmanager.domain.user.UserRole;
import com.example.bookmanager.exception.DuplicateValueException;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CreateUserUseCase {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final EmailDuplicateChecker emailDuplicateChecker;

  /**
   * ユーザーを登録する
   *
   * @param input 登録するユーザーデータ
   * @return 登録したユーザーデータのID
   */
  @Transactional
  public UserId create(final CreateUserInput input) throws DuplicateValueException {
    
    emailDuplicateChecker.checkDuplicate(input.getEmail());
    
    final User user = User.createNewUser(
        input.getLastName(),
        input.getFirstName(),
        input.getEmail(),
        passwordEncoder.encode(input.getPassword()),
        UserRole.of(input.getRole())
    );

    userRepository.register(user);

    return user.getId();
  }
}