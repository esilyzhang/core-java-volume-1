public class CallingAnotherConstructor {
  public static void main(String[] args) {
    var stuff = new Employee(10.0);
    System.out.println(stuff.getId());
  }
}

class Employee {
  private static int nextId;
  private int id;
  private double salary;

  public Employee(double aSalary) {
    this(nextId, aSalary);
    nextId++;
  }

  public Employee(int aId, double aSalary) {
    id = aId;
    salary = aSalary;
  }

  public int getId() {
    return id;

  }

  public double getSalary() {
    return salary;
  }
}
