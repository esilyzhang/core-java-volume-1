import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputAndOutput {
  public static void main(String[] args) {
    // 从文件中读取内容
    try {
      Scanner in = new Scanner(Path.of("D:\\Projects\\java\\java\\src\\3\\3.7\\myFile.txt"), StandardCharsets.UTF_8);
      System.out.println(in.nextLine()); // 读取第一行
      in.close();
      // 写文件
      PrintWriter out = new PrintWriter("D:\\Projects\\java\\java\\src\\3\\3.7\\myFile.txt", StandardCharsets.UTF_8);
      out.print("Add nex line.");
      out.close();
      // java FileInputAndOutput 相对路径是 Command line shell 的路径
      System.out.println(System.getProperty("user.dir")); // 集成式开发环境会指定的开始路径
      Scanner in2 = new Scanner(Path.of("relativePathOfFile.txt"), StandardCharsets.UTF_8); // 文件的相对路径是 Java 的执行路径
      System.out.println(in2.nextLine());
      in2.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
