package com.example.bookmanager.domain.book;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.seasar.doma.Domain;

@Domain(valueType = Integer.class, factoryMethod = "of")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum LoanStatus {

	LOANED(0, "貸出中"),
	RETURNED(1, "返却済み");

	private final Integer value;
	private final String label;

	public static LoanStatus of(Integer value) {
		for (LoanStatus status : LoanStatus.values()) {
			if (status.value.equals(value)) {
				return status;
			}
		}
		throw new IllegalArgumentException("Invalid LoanStatus value: " + value);
	}
}
