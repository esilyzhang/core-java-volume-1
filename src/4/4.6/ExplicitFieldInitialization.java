public class ExplicitFieldInitialization {
  public static void main(String[] args) {
    // 属性显示初始化
    var stuff = new Employee3();
    System.out.printf("id: %d", stuff.getId());
  }
}

class Employee3 {
  private static int nextId;
  private int id = assignId();

  public int getId() {
    return id;
  }

  private static int assignId() {
    int id = nextId;
    nextId += 1;
    return id;
  }
}