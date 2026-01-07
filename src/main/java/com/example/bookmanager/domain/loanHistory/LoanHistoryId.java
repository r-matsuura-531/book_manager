package com.example.bookmanager.domain.loanHistory;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

/**
 * 書籍貸し出し履歴ID
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = String.class)
@AllArgsConstructor
public class LoanHistoryId {

	private final String value;
}