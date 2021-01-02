public class CodePointsAndCodeUnits {
  public static void main(String[] args) {
    // 字符串是 char 类型的序列 UTF-16 编码中，每个字符对应一个【码点】
    // char 类型只是展示码点中的一个单元码值，常用的 Unicode 字符只需要一个码单元，扩展的字符则需要一对码单元。
    // 码单元（Code Unit）；码点（Code Points）
    String greeting = "Hello𝕆";
    int n = greeting.length(); // 返回码单元的数量
    System.out.println("String length 返回(Hello𝕆)码单元的长度 " + n);
    int cpCount = greeting.codePointCount(0, greeting.length()); // 返回真实的字符长度
    System.out.println("String length 返回(Hello𝕆)真实字符的长度 " + cpCount);
    System.out.println("String codeAt 返回代码单元 n 位置的值 " + greeting.charAt(5)); // 码单元的 n 位置
    System.out.println("单元码值是否是替代码" + Character.isSurrogate(greeting.charAt(5)));
    int[] codePoints = greeting.codePoints().toArray();
    System.out.println("字符单元数组 " + codePoints.length + ' ' + new String(codePoints, 0, codePoints.length));
    System.out.println("String codePointAt 返回 n 位置字符码值 " + greeting.codePointAt(5)); // 字符的 n 位置，对应的码值（十进制）
    System.out.println("字符是否是扩展字符 " + Character.isSupplementaryCodePoint(greeting.codePointAt(5)));
    System.out.println("String offsetByCodePoints 返回 n~m 位置单元值的真实距离 " + greeting.offsetByCodePoints(0, 5)); // 字符之间码单元的距离
    System.out.println("String " + (char) 0x1d546);

  }
}
