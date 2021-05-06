public class BlockScope {
  public static void main(String[] args) {
    // 块作用域
    // 块由许多的语句够成
    // 不能够在块作用域中声明相同变量名的变量
    // 一条语句
    if (true)
      System.out.println("True");
    // 多条语句
    if (true) {
      System.out.println("One");
      System.out.println("Two");
    }
    // if/else
    if (Math.round(Math.random() * 100) > 150)
      System.out.println("> 150");
    else
      System.out.println("<= 150");
    // if/else if
    if (Math.round(Math.random() * 100) > 190)
      System.out.println("> 190");
    else if (Math.round(Math.random() * 100) > 150)
      System.out.println("150 < num <= 190");
    else
      System.out.println("<= 150");
  }
}
