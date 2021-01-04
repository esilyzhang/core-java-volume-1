import java.util.Arrays;

public class MultidimensionalArrays {
  public static void main(String[] args) {
    // 多维数组
    int[][] magicSquare = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 } };
    System.out.println("多维数组：" + Arrays.toString(magicSquare[0]));
    System.out.println("多维数组：" + Arrays.toString(magicSquare[1]));
    // 遍历元素
    for (int[] arr : magicSquare)
      for (int n : arr)
        System.out.println("二维数组中每个值：" + n);
  }
}
