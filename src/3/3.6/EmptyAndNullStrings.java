public class EmptyAndNullStrings {
  public static void main(String[] args) {
    String emptyStr = "";
    System.out.println("空字符串：str.length() == 0 " + (emptyStr.length() == 0));
    System.out.println("空字符串：str.equals(\"\") " + (emptyStr.equals("")));
    String nullStr = null;
    System.out.println("String 变量可以赋值null " + nullStr);
    System.out.println("String 变量判断是否为 null " + (nullStr == null));
  }
}
