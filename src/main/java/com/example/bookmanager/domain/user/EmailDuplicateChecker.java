package com.example.bookmanager.domain.user;

import com.example.bookmanager.exception.DuplicateValueException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * メールアドレスの重複チェックを行うドメインサービス
 */
@Component
@AllArgsConstructor
public class EmailDuplicateChecker {

  private final UserRepository userRepository;

  /**
   * メールアドレスが重複しているかチェックする
   *
   * @param email メールアドレス
   * @throws DuplicateValueException メールアドレスが重複している場合
   */
  public void checkDuplicate(final String email) throws DuplicateValueException {
    if (email == null) {
        throw new IllegalArgumentException("メールアドレスが指定されていません");
    }
    
    if (userRepository.existsByEmail(email)) {
      throw new DuplicateValueException("メールアドレスが重複しています", "isbn");
    }
  }
}