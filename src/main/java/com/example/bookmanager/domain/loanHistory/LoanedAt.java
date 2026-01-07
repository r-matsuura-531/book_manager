package com.example.bookmanager.domain.loanHistory;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

import java.time.LocalDateTime;

/**
 * 貸し出し日時
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = LocalDateTime.class)
@AllArgsConstructor
public class LoanedAt {

	private final LocalDateTime value;
}