import java.io.Console;
import java.util.Scanner;

public class ReadingInput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is your fullname?");
    String name = in.nextLine(); // 读取一行
    System.out.println("My name is " + name);
    System.out.println("What is your first name?");
    String firstName = in.next();
    System.out.println("My first name is " + firstName);
    System.out.println("What is your last name?");
    String lastName = in.next();
    System.out.println("My last name is " + lastName);
    System.out.println("How old are you?");
    int age = in.nextInt(); // 类似 nextDouble
    System.out.println("Your age is " + age);
    in.close();
    Console cons = System.console();
    if ((cons = System.console()) != null) {
      // cons 是否为 null，依据底层的平台和调用 JVM 的方式；如果 JVM 时自动运行，比如后台启动，是没有
      // console的；如果是不带重定向的标准的输入和输出流的交互式命令行中启动，然后将会是存在 console 的。
      String username = cons.readLine("User name: ");
      char[] passwd = cons.readPassword("Password: ");
      System.out.println(username + ":" + passwd.toString());
    }
  }
}
