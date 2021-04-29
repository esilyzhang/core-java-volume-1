/**
 * @version 0.0.1
 * @author Esily Zhang
 */
package esily.inheritance;

import java.time.*;

/**
 * Employee
 */
public class Employee {
  /**
   * the name of the employee.
   * 
   * @hidden
   */
  private String name;
  /**
   * the salary of the employee.
   * 
   * @hidden
   */
  private double salary;
  /**
   * the hire date of the employee.
   * 
   * @hidden
   */
  private LocalDate hireDay;

  /**
   * Employee
   * 
   * @param name   the name of the employee
   * @param salary the salary of the employee
   * @param year   the hire year of the employee
   * @param month  the hire month of the employee
   * @param day    the hire day of the employee
   */
  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    this.hireDay = LocalDate.of(year, month, day);
  }

  /**
   * Get the name of an employee
   * 
   * @return the name of the employee
   */
  public String getName() {
    return name;
  }

  /**
   * Get the salary of an employee
   * 
   * @return the salary of the employee
   */
  public double getSalary() {
    return salary;
  }

  /**
   * Get the hire date of an employee
   * 
   * @return hire date of the employee
   */
  public LocalDate getHireDay() {
    return hireDay;
  }

  /**
   * Raise the salary of an employee
   * 
   * @param byPrecent the percentage by which to raise the salary
   * @return the amount of the raise
   */
  public void raiseSalary(double byPrecent) {
    salary += salary * byPrecent / 100;
  }
}
