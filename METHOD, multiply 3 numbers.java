import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please provide the first number: ");
    int number1 = scanner.nextInt();

    System.out.print("Please provide the second number: ");
    int number2 = scanner.nextInt();

    System.out.print("Please provide the third number: ");
    int number3 = scanner.nextInt();

    int result = multiply(number1, number2, number3);

    System.out.print("The result is: ");
    System.out.println(result);

    scanner.close();
  }

  public static int multiply(int a, int b, int c) {
    return a * b * c;
  }
}
