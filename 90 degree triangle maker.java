import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide a number: ");
    int number = scanner.nextInt();

    String triangle = "_";

    for (int i = 1; i <= number; i++) {
      System.out.println(triangle);
      triangle = triangle + "_";
    }

    scanner.close();
  }
}
