package com.example.bookmanager.infrastructure.loanhistory;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "loan_histories", schema = "bookmanager")
@Getter
@Setter
public class LoanHistoryEntity {

	@Id
	private String id;

	private String bookId;

	private String userId;

	private LocalDateTime loanedAt;

	private LocalDate returnDueOn;

	private LocalDateTime returnedAt;

	private LocalDateTime createdAt;

	private String createdBy;

	private LocalDateTime updatedAt;

	private String updatedBy;

	private int deleted;
}
