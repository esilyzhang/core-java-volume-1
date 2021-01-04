import java.util.Arrays;

public class ArrayCopying {
  public static void main(String[] args) {
    // 数组拷贝
    int[] lukyNumbers = { 1, 2, 3, 4, 5 };
    int[] copiedLuckyNumbers = Arrays.copyOf(lukyNumbers, lukyNumbers.length);
  }
}
