import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 3, 4, 2, 5, 8};

    boolean isFound = false;
    
    System.out.print("Please write your favorite number: \n");
    int answer = scanner.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == answer) {
        isFound = true;
        System.out.println("Your favorite number is in the array");
        break;
      }
    }

    if (isFound == false) {
      System.out.println("Your favorite number is not found");
    }
    
    scanner.close();
  }
}
