import java.util.Scanner;

public class MultipleSelections {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Select an option (1, 2, 3, 4) ");
    int choice = in.nextInt();
    // case 可以是 char,byte,short,int 的静态表达式；java7 开始支持字符串
    switch (choice) {
      case 1:
        System.out.println(choice);
        break;
      case 2:
        System.out.println(choice);
        break;
      case 3:
        System.out.println(choice);
        break;
      case 4:
        System.out.println(choice);
        break;
      default:
        System.out.println(choice);
        break;
    }
    in.close();
  }
}
