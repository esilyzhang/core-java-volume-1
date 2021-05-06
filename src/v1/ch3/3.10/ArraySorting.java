import java.util.Arrays;

public class ArraySorting {
  public static void main(String[] args) {
    // 数组排序
    int[] numArr = { 5, 4, 3, 2, 1 };
    Arrays.sort(numArr); // 快速排序
    System.out.println("数组排序：" + Arrays.toString(numArr));
  }
}
