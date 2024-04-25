import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] guests = {"Mart", "Kalev", "Annika", "Laura"};

    System.out.print("Check if your on the list: ");
    String answer = scanner.nextLine();

    result(guests, answer);

    scanner.close();
  }
  public static void result(String[] guests, String answer) {
    boolean isFound = false;

    for (int i = 0; i < guests.length; i++) {
      if (answer.equals(guests[i])) {
        isFound = true;
        System.out.println(answer + " is on the list.");
        break;
      } 
    }

    if (isFound == false){
      System.out.println(answer + " is not on the list.");
    }
  }
}
