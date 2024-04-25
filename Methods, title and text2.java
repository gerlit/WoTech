import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a title: ");
    String title = getText();

    System.out.print("Enter a description: ");
    String description = getText();

    getPrintout(title, description);

    scanner.close();
  }

  public static String getText() {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    return text;
  }

  public static void getPrintout(String title, String description) {

    int length = title.length();
    String border = "=".repeat(length);

    System.out.println(border);
    System.out.println(title);
    System.out.println(border);
    System.out.println(description);

  }
}
