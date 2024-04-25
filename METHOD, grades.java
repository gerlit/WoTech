import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please provide grade: ");
    int grade = scanner.nextInt();

    checkGrades(grade);

    scanner.close();
  }

  public static void hooraay() {
    System.out.println("Hooraay");
  }

  public static void sad() {
    System.out.println("Sad");
  }

  public static void checkGrades(int grade) {
    int aboveAverage = 8;
    if (grade > aboveAverage) {
      hooraay();
    } else {
      sad();
    }
  }
}
