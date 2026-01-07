package com.example.bookmanager.domain.loanHistory;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

import java.time.LocalDate;

/**
 * 返却期限日
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = LocalDate.class)
@AllArgsConstructor
public class ReturnDueOn {

	private final LocalDate value;

	/**
	 * 現在日時より未来の日付かどうかをチェックする
	 * @return true: 現在日時より未来の日付, false: 現在日時より過去の日付
	 */
	public boolean hasFutureDate() {
		return !value.isBefore(LocalDate.now());
	}

	/**
	 * 2週間以内の日付かどうかをチェックする
	 * @return true: 2週間以内の日付, false: 2週間以上先の日付
	 */
	public boolean hasWithinNextTwoWeeks() {
		return !value.isAfter(LocalDate.now().plusWeeks(2));
	}

}