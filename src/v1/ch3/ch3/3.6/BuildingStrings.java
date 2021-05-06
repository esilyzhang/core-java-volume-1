public class BuildingStrings {
  public static void main(String[] args) {
    // 拼接字符串
    // StringBuilder 避免每次 new String 节省了内存
    StringBuilder builder = new StringBuilder();
    builder.append('A'); // 添加 char
    builder.append("A"); // 添加字符串
    String compeleString = builder.toString(); // 输出结果
    System.out.println("输出拼接的字符串 " + compeleString);
    // api
    System.out.println("int length() 返回 builder 或者 buffer 的码单元的数量 " + builder.length());
    System.out.println("StringBuilder append(String str|Char c) 追加字符串或字符 " + builder.append('B'));
    System.out
        .println("StringBuilder appendCodePoint(int cp) 通过码值添加一个字符 " + builder.appendCodePoint("𝕆".codePointAt(0)));
    builder.setCharAt(1, 'B');
    System.out.println("void setCharAt(int i, char c) 设置第 i 码单元位置的 char 字符 c " + builder);
    System.out.println(
        "StringBuilder insert(int offset, Stirng str|char c) 码单元距离位置 offset 插入字符串或者字符 " + builder.insert(3, "INSET"));
    System.out.println("StringBuilder delete(int startIndex, int endIndex) 删除码单元之间的字符 " + builder.delete(0, 3));
    System.out.println("String toString() 返回 builder 或者 buffer 的字符串 " + builder.toString());
  }
}
