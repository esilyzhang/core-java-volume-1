public class AccessingArrayElements {
  public static void main(String[] args) {
    int[] a = new int[100]; // 数字类型，数组所有的元素初始化为 0
    boolean[] b = new boolean[100]; // 布尔类型，数组所有的元素初始化为 false
    String[] c = new String[100]; // 对象类型，数组所有元素初始化为 null
    for (int i = 0; i < 100; i++)
      a[i] = i;
  }
}
