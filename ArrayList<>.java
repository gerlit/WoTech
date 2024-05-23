import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i <= 5; i++) {
      if (i < 5) {
        int number = scanner.nextInt();
        addNumber(numbers, number);
      } else {
        printArrayList(numbers);
        filteredArrayList(numbers);
      }
    }
  }

  public static void addNumber(ArrayList<Integer> numbers, int number) {
    numbers.add(number);
    System.out.println(number + " has been added to the list. ");
  }

  public static void printArrayList(ArrayList<Integer> numbers) {
    System.out.println("\nYour list is: ");
    for (int number : numbers) {
      System.out.println(number);
    }
  }

  public static void filteredArrayList(ArrayList<Integer> numbers) {
    System.out.println("\nYour filtered list is: ");
    for (int number : numbers) {
      if(number % 2 == 0){
        System.out.println(number);
      }
    }
  }
}
