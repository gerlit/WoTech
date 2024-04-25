import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("First name: ");
    String name1 = scanner.nextLine();

    System.out.print("Last name: ");
    String name2 = scanner.nextLine();

    String result = fullName(name1, name2);

    System.out.print("The result is: ");
    System.out.println(result);

    scanner.close();
  }

  public static String fullName(String a, String b) {
    return a + " " + b;
  }
}
