import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please provide a number: ");
    int number1 = scanner.nextInt();

    System.out.print("Please provide another number: ");
    int number2 = scanner.nextInt();

    int result = smallest(number1, number2);

    System.out.print("Smallest number of these two is: ");
    System.out.println(result);

    scanner.close();
  }

  public static int smallest (int a, int b) {
    if (a > b) {
      return b;
    } else {
      return a;
    }
  }
}
