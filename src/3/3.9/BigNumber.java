import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class BigNumber {
  public static void main(String[] args) {
    // 操作任意长度的数字
    // BigInterger 可以计算任意精度的整数
    // BigDecimal 可以计算任意精度的小数
    // valueOf 转换原数为 big number
    BigInteger a = BigInteger.valueOf(100);
    // 对于更长的数，使用参数为字符串类型数字的构造函数
    BigInteger b = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
    // BigInteger 的静态值
    System.out.println("BigInteger.ZERO" + BigInteger.ZERO);
    System.out.println("BigInteger.ONE" + BigInteger.ONE);
    // 大数运算 add multiply divide
    BigInteger c = a.add(b); // c=a+b
    System.out.println("a + b = " + c);
    BigInteger d = c.multiply(BigInteger.valueOf(2));// d = c * 2
    System.out.println("c * 2 = " + d);
    BigInteger e = c.divide(BigInteger.valueOf(2)); // e = c / 2
    System.out.println("c / 2 = " + e);
    BigInteger f = c.subtract(BigInteger.valueOf(1)); // f = c - 1
    System.out.println("c - 1 = " + f);
    BigInteger g = c.mod(BigInteger.valueOf(2)); // g = c mod 2
    System.out.println("c mod 2 = " + g);
    BigInteger h = BigInteger.valueOf(16).sqrt(); // 16 sqrt
    System.out.println("16 sqrt " + h);
    int i = BigInteger.valueOf(16).compareTo(BigInteger.valueOf(10));
    System.out.println("16 与 14 比大小 " + i);
    // BigDecimal 类似
    BigDecimal A = BigDecimal.valueOf(16).divide(BigDecimal.valueOf(4), RoundingMode.HALF_UP);
    System.out.println("16 / 4 = " + A);
    // x / 10(^scale)
    System.out.println(BigDecimal.valueOf(16, 2)); // 0.16
  }
}
