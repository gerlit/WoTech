import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    System.out.println("How many city names would you like to enter: ");
    int howMany = scanner.nextInt();
    scanner.nextLine();

    String[] arr = new String[howMany];

    System.out.println("\nPlease enter your city names: ");
    for (int i = 0; i < howMany; i++) {
      arr[i] = scanner.nextLine();
    }

    System.out.print("\nHere is your list: ");
    for (int i = 0; i < howMany; i++) {
      int value = howMany - i;
      if (value == 1) {
        System.out.print(arr[i] + ".");
      } else {
        System.out.print(arr[i] + ", ");
      }
    }

    scanner.close();
  }
}
