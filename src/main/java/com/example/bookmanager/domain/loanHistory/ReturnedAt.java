package com.example.bookmanager.domain.loanHistory;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

import java.time.LocalDateTime;

/**
 * 返却日時
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = LocalDateTime.class)
@AllArgsConstructor
public class ReturnedAt {

	private final LocalDateTime value;

	public boolean isEmpty() {
		return value != null;
	}

  /**
   * 未返却の状態を表すインスタンスを生成する
   * */
  public static ReturnedAt empty() {
    return new ReturnedAt(null);
  }
}