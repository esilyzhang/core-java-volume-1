public class InitializationBlocks {
  public static void main(String[] args) {
    var stuff1 = new Employee();
    var stuff2 = new Employee();
    System.out.println(stuff1.getId());
    System.out.println(stuff2.getId());
  }
}

class Employee {
  private static int nextId;
  private int id;
  {
    // 块代码
    id = nextId;
    nextId++;
  }
  static {
    // 类第一次加载执行
    System.out.println("类第一次加载执行");
  }

  public int getId() {
    return id;
  }
}