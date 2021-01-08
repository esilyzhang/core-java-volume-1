package cn.esliy.horstmann;

import java.time.*;

public class Employee {
  /**
   * The name of the employee.
   */
  private String name;
  /**
   * the salary of employee.
   */
  private double salary;
  /**
   * the hire date of employee.
   */
  private LocalDate hireDay;

  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    hireDay = LocalDate.of(year, month, day);
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getHireDay() {
    return hireDay;
  }

  /**
   * Raise the salary of an employee.
   * 
   * @param byPercent the percentage by which to raise the salary (eg., 10 means
   *                  10%)
   * @return the amount of salary
   */
  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }
}