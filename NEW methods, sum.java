import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Please provide a number: ");
    int number1 = scanner.nextInt();
    
    System.out.print("Please provide another number: ");
    int number2 = scanner.nextInt();
    
    int result = sum(number1, number2);

    System.out.print("Adding these two numbers makes: ");
    System.out.println(result);

    scanner.close();
  }

  public static int sum (int number1, int number2) {
    return number1 + number2;
  }
}
