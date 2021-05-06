package esily.inheritance;

public class Manager extends Employee {
  private double bonus;

  /**
   * @param name   the employee's name
   * @param salary the employee's salary'
   * @param year   the hire year
   * @param month  the hire month
   * @param day    the hire day
   */
  public Manager(String name, double salary, double bonus, int year, int month, int day) {
    super(name, salary, year, month, day);
    this.bonus = bonus;
  }

  /**
   * get the salary of manager
   * 
   * @return mount of eh salary
   */
  public double getSalary() {
    // 多态
    double baseSalary = super.getSalary();
    return baseSalary + bonus;
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
}
