public class TheForEachLoop {
  public static void main(String[] args) {
    // 数组遍历
    int[] numArr = { 1, 2, 3, 4, 5 };
    for (int num : numArr) // 适用于数组或者 Iterable 类的实例
      System.out.println("数组中每一项数字：" + num);
    // 传统的方式
    for (int i = 0; i < numArr.length; i++)
      System.out.println("数组中每一项数字：" + numArr[i]);
  }
}
