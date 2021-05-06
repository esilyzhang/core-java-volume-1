public class TestingStringForEquality {
  public static void main(String[] args) {
    System.out.println("Hello 是否和 Hello 相等：" + "Hello".equals("Hello"));
    System.out.println("Hello 是否和 hello 相等：" + "Hello".equals("hello"));
    System.out.println("Hello 是否和 hello 相等(忽略大小写)：" + "Hello".equalsIgnoreCase("hello"));
    String str1 = "Hello";
    System.out.println("str1 == \"Hello\" " + (str1 == "Hello"));
    System.out.println("str1.substring(0,3) == \"Hel\" " + (str1.substring(0, 3) == "Hel"));
  }
}