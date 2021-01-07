public class MethodParameters {
  private static double tripleValue(double x) {
    x *= 3;
    return x;
  }

  private static void swap(Employee2 x, Employee2 y) {
    // 对调引用
    Employee2 temp = x;
    x = y;
    y = temp;
    // x-->Bob y-->Alice
  }

  public static void main(String[] args) {
    double precent = 10;
    System.out.printf("tripleValue 返回的值：%f，precent: %f", tripleValue(precent), precent);
    System.out.println();
    // 参数为对象：引用的操作,引用的拷贝
    var a = new Employee2("Alice", 28);
    var b = new Employee2("Bob", 29);
    swap(a, b);
    System.out.printf("a refered to %s, b refered to %s", a.getName(), b.getName());
  }
}

class Employee2 {
  private String name;
  private int age;

  Employee2(String n, int a) {
    super();
    name = n;
    age = a;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}