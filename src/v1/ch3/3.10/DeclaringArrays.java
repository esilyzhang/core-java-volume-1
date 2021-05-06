public class DeclaringArrays {
  public static void main(String[] args) {
    // 定义数组
    int[] a; // 声明数组
    a = new int[100]; // 初始化数组，之后数组的长度不能改变
    // 简写
    int[] smallPrime = { 2, 3, 5, 7, 11, 13,/* 之后会添加的元素 */ };
    // 匿名数组
    // new int[]{17,19,23,29,31,37};
    // 重新初始化数组
    smallPrime = new int[] { 17, 19, 23, 29, 31, 37 }; // 简写 smallPrime = anonymous;
    // 空数组
    int[] emptyArr = new int[0];
  }
}
