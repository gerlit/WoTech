import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide a number: ");
    int number = scanner.nextInt();

    for (int i = 1; i <= number; i++) {
      if (i % 3 == 0 && i % 5 == 0){
        System.out.println("WoTech");
      } else if (i % 3 == 0){
        System.out.println("Wo");
      } else if (i % 5 == 0){
        System.out.println("Tech");
      } else {
        System.out.println(i);
      }
    }

    scanner.close();
  }
}
