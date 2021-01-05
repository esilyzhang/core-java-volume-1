import java.time.LocalDate;
import java.util.Objects;

public class AnEmployeeClass {
  public static void main(String[] args) {
    Employee[] staff = new Employee[3];

    staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
    staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
    staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

    // 整体提高 5% 工资
    for (Employee e : staff)
      e.raiseSalary(5);

    // 输出所有雇员的信息
    for (Employee e : staff) {
      System.out.printf("name: %s, salary: %f, hireDay: %tY-%<tm-%<td", e.getName(), e.getSalary(), e.getHireDate());
      System.out.println();
    }
  }
}

// Employee 类
class Employee {
  private String name;
  private double salary;
  private LocalDate hireDate;

  public Employee(String n, double s, int year, int month, int day) {
    name = Objects.requireNonNull(n, "unknown"); // n 参数非 null - 9
    salary = s;
    hireDate = LocalDate.of(year, month, day);
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  // 获取 private 数据
  public boolean equals(Employee other) {
    return name.equals(other.name);
  }

  public void raiseSalary(double byPrecent) {
    // 方法前面还有隐式参数(Implicit Parameter)-也称为 target 或者 receiver
    // byPrecent 显示参数(Explicit Parameter)
    // 区分为实例域和本地变量
    double raise = this.salary * byPrecent / 100;
    this.salary += raise;
  }
}