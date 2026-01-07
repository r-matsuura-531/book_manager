package com.example.bookmanager.domain.user;

public interface UserRepository {

  /**
   * メールアドレスでユーザを検索する
   *
   * @param email メールアドレス
   * @return ユーザ
   */
  User findByEmail(String email);
  
  /**
   * メールアドレスが存在するか確認する
   *
   * @param email メールアドレス
   * @return 存在する場合はtrue
   */
  boolean existsByEmail(String email);

  /**
   * ユーザを登録する
   *
   * @param user ユーザ
   */
  void register(User user);

}