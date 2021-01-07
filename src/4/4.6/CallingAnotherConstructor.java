public class CallingAnotherConstructor {
  public static void main(String[] args) {
    var stuff = new Employee4(10.0);
    System.out.println(stuff.getId());
  }
}

class Employee4 {
  private static int nextId;
  private int id;
  private double salary;

  public Employee4(double aSalary) {
    this(nextId, aSalary);
    nextId++;
  }

  public Employee4(int aId, double aSalary) {
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
