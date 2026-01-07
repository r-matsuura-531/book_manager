package com.example.bookmanager.domain.book;

import com.example.bookmanager.domain.loanHistory.ReturnDueOn;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.seasar.doma.Domain;

/**
 * 遅延日数
 */
@Getter
@EqualsAndHashCode
@Domain(valueType = Integer.class)
@AllArgsConstructor
public class OverDueDays {

  private final Integer value;

  /**
   * 現在の貸出状況と返却期限日から遅延日数を計算する
   *
   * @param loanStatus 貸出状況
   * @param returnDueOn 返却期限日
   * @return 遅延日数
   */
  public static OverDueDays calculateFrom(LoanStatus loanStatus, ReturnDueOn returnDueOn) {
    if (loanStatus == LoanStatus.RETURNED) {
      return new OverDueDays(0);
    }

    final LocalDate now = LocalDate.now();
    final Integer overDueDays = returnDueOn.getValue().isAfter(now) ? 0 : (int) ChronoUnit.DAYS.between(returnDueOn.getValue(), now);
    return new OverDueDays(overDueDays);
  }
}