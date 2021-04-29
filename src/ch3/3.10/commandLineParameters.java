public class commandLineParameters {
  public static void main(String[] args) {
    if (args.length == 0 || args[0].equals("-h"))
      System.out.println("Hello,");
    else if (args[0].equals("-g"))
      System.out.println("Goodbye");

    for (String arg : args)
      System.out.println(" " + arg);
    System.out.println("!");
  }
}
