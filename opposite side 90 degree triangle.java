import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide a number: ");
    int number = scanner.nextInt();

    String triangle = "_";
    String space = " ";
    
    for (int i = 1; i <= number; i++) {
      int spaces = number - i;
      String spaceResult = space.repeat(spaces);
      System.out.print(spaceResult);
      System.out.println(triangle);
      triangle = triangle + "_";
    }

    scanner.close();
  }
}
