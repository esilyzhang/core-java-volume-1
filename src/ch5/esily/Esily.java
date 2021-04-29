/**
 * @package esily
 */
package esily;

import esily.inheritance.*;

public class Esily {
  public Esily() {
    var stuff = new Employee("Esily", 10.0, 2020, 9, 10);
    var manager = new Manager("Esily Zhang", 100.0, 10, 2019, 8, 9);
    System.out.printf("Stuff's name: %s, stuff's salary: %f", stuff.getName(), stuff.getSalary());
    System.out.println();
    System.out.printf("Manager's name: %s, manager's salary: %f", manager.getName(), manager.getSalary());
    System.out.println();
    System.out.printf("Manager's name: %s, manager's salary: %f, manager's bonus: %f", manager.getName(),
        manager.getSalary(), manager.getBonus());
    System.out.println();
  }
}
