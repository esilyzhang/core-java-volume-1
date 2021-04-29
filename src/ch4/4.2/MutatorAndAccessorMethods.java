import java.time.LocalDate;

public class MutatorAndAccessorMethods {
  public static void main(String[] args) {
    // 设置时间
    LocalDate newYearEve = LocalDate.now();
    LocalDate aThousandDaysLater = newYearEve.plusDays(1000);
    int year = aThousandDaysLater.getYear(); // 年
    int month = aThousandDaysLater.getMonthValue();// 月
    int day = aThousandDaysLater.getDayOfMonth(); // 日
    System.out.printf("当前 1000 天之后的日期：%d年-%02d月-%02d日", year, month, day);
    System.out.println();
  }
}