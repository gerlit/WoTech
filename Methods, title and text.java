import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide a title: ");
        String title = scanner.nextLine();

        System.out.print("Please provide text: ");
        String text = scanner.nextLine();

        int length = title.length();
        String oneLine = "=";

        line(length, oneLine);
        System.out.println(title);
        line(length, oneLine);
        System.out.println(text);

        scanner.close();
    }

    public static void line(int length, String oneLine) {
        String lines = oneLine.repeat(length);
        System.out.println(lines);
    }
}
