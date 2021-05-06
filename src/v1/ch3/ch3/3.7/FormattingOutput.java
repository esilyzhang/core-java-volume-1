import java.util.Date;

public class FormattingOutput {
  public static void main(String[] args) {
    // 格式化输出
    double x = 10000.0 / 3.0;
    System.out.print(x); // 打印 x ，该类型的非零数字的最长的数字
    // 从 Java5 开始，引进了 C 的 pritf
    System.out.printf("%8.2f", x);
    // printf 可以支持多个参数
    System.out.printf("Hello, %s. Next year, you'll be %d", "Esily", 28);
    System.out.printf("%,(.2f ", -x);
    // 可以使用 String.format 创建一个格式化字符串
    String message = String.format("Hello, %s. Next year, you'll be %d", "Esily", 28);
    System.out.println(message);
    System.out.printf("%tc", new Date());
    // 格式化可以指定通过 索引$ 指定哪个参数
    System.out.printf("%1$s %2$2tB %2$te, %2$tY", "Due date:", new Date());
    // < 标记使用上一个参数
    System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
  }
}
