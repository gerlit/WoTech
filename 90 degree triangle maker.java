import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide a number: ");
    int number = scanner.nextInt();

    for (String triangle = "_"; number != 0; number = number - 1) {
      System.out.println(triangle);
      triangle = triangle + "_";
    }

    scanner.close();
  }
}
