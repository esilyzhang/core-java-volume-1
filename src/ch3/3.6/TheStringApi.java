public class TheStringApi {
  public static void main(String[] args) {
    // String 类的方法有超过 50 个方法
    // 下面是最常用的
    String str = "Hello𝕆";
    System.out.println("char charAt(int index) 返回码单元在 index 索引位置的 char 字符" + str.charAt(1)); // 不常用
    System.out.println("int codePointAt(int index) 返回字符在 index 索引位置的码值" + str.codePointAt(5));
    System.out
        .println("int offsetByCodePoints(int startIndex,int endIndex) 返回字符之间的字符数量" + str.offsetByCodePoints(0, 5));
    System.out.println("int compareTo(String other) 比较字符串()" + "aaa".compareTo("abc")); // a 在 b 的前面一位
    System.out.println("int compareTo(String other) 比较字符串()" + "aea".compareTo("abc")); // e 在 b 的后面三位
    System.out.println("int compareTo(String other) 比较字符串()" + "abc".compareTo("abc")); // 相等
    System.out.println("IntStream codePoints() 字符转换为 stream " + new String(str.codePoints().toArray(), 0, 6));
    System.out.println("boolean isEmpty() 字符串是否为空 " + "".isEmpty()); // empty blank-11
    System.out.println("boolean equals(Object other) 字符串是否相等" + str.equals("Hello𝕆"));
    System.out.println("boolean equalsIgnoreCase(String other) 忽略大小写字符串是否相等 " + "Abc".equalsIgnoreCase("abc"));
    System.out.println("boolean startsWith(String prefix) 字符串是否拥有前缀 " + str.startsWith("Hello"));
    System.out.println("boolean endsWith(String suffix) 字符串是否拥有后缀 " + str.endsWith("𝕆"));
    System.out.println("int indexOf(String str) 字符串中字符串的第一个索引位置 " + str.indexOf("llo"));
    System.out.println("int indexOf(String str,int fromIndex) 从索引位置开始的字符串的第一个索引位置 " + str.indexOf("lo", 2));
    System.out.println("int indexOf(int cp) 码值的第一个索引位置 " + str.indexOf(str.codePointAt(5)));
    System.out.println("int indexOf(int cp, int fromIndex) 从索引位置开始的码值的第一个索引位置 " + str.indexOf(str.codePointAt(5), 0));
    // lastIndexOf 同上
    System.out.println("int length() 字符串码单元的数量 " + str.length());
    System.out
        .println("int codePointCount(int startIndex, int endIndex) 在索引位置开始值和结束值-1之间字符的数量" + str.codePointCount(5, 7));
    System.out
        .println("String replace(CharSequence oldString, CharSequence newString) 替换字符串 " + str.replace("ello", "ELLO"));
    System.out.println("String subtring(int beginIndex, int endIndex) 子字符串 " + str.substring(0, 5));
    System.out.println("String toLowerCase() 转换为小写 " + str.toLowerCase());
    System.out.println("String toUpperCase() 转换为大写 " + str.toUpperCase());
    System.out.println("<=U+0020 的字符串" + "\u0009" + "->end");
    System.out.println("String trim() 返回去掉头尾字符(<=U+0020)新的字符串 " + "->" + ("\u0009" + str + "\u0009").trim() + "<-");
    System.out.println("String strip()-11 返回去掉头尾字符(<=U+0020)或者空格新的字符串 " + ("\u0009 ->" + str + " ").trim() + "<-");
    System.out.println(
        "String join(CharSequence delimeter, CharSequence... elments)-8 通过分割符组合字符串" + String.join("-", "b", "c"));
    System.out.println("String repeat(int count)-11 重复 count 次的字符串" + str.repeat(5));
    // https://docs.oracle.com/javase/9/docs/api/overview-summary.html
  }
}
