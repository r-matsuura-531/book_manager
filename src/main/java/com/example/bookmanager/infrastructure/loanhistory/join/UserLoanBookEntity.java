package com.example.bookmanager.infrastructure.loanhistory.join;

import lombok.Getter;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Getter
public class UserLoanBookEntity {

	@Id
	private String id;

	private String title;

	private String authorName;

	private String publisherName;

	private LocalDateTime loanedAt;

	private LocalDate returnDueOn;

	private LocalDateTime returnedAt;
}
