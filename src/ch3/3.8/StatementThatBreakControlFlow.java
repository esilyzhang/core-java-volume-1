import java.util.Scanner;

public class StatementThatBreakControlFlow {
  public static void main(String[] args) {
    // break 退出循环
    // 退出多层嵌套循环
    Scanner in = new Scanner(System.in);
    int n;
    read_data: while (true) {
      for (int i = 0; i < 10; i++) {
        System.out.println("Enter a number >= 0: ");
        n = in.nextInt();
        if (n < 0)
          break read_data;
      }
    }
    in.close();
    // continue
    Scanner in2 = new Scanner(System.in);
    int sum = 0;
    while (sum < 10) {
      System.out.println("Enter a number");
      if (in2.nextInt() < 0)
        continue;
      sum += 1;
    }
    in2.close();
  }
}
