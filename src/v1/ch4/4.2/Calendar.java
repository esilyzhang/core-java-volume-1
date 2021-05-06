import java.time.LocalDate;
import java.time.DayOfWeek;

public class Calendar {
  public static void main(String[] args) {
    // 日历
    LocalDate date = LocalDate.now();
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();

    date = date.minusDays(today - 1);// 设置月份的开始日期
    DayOfWeek weekday = date.getDayOfWeek();
    int value = weekday.getValue();// 1 = Monday,...,7 = Sunday

    System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    for (int i = 1; i < value; i++)
      System.out.print("    ");
    while (date.getMonthValue() == month) {
      System.out.printf("%3d", date.getDayOfMonth());
      if (date.getDayOfMonth() == today)
        System.out.print("*");
      else
        System.out.print(" ");
      date = date.plusDays(1);
      if (date.getDayOfWeek().getValue() == 1)
        System.out.println();
    }
    if (date.getDayOfWeek().getValue() != 1)
      System.out.println();
  }
}
