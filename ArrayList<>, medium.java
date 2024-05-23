import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Integer> randomNumbers = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      int randomNumber = (int) (Math.random() * 100);
      randomNumbers.add(randomNumber);
    }

    printArrayList(randomNumbers);
    filteredArrayList(randomNumbers);
  }

  public static void printArrayList(ArrayList<Integer> numbers) {
    System.out.println("\nYour list is: ");
    for (int number : numbers) {
      System.out.print(number + ", ");
    }
  }

  public static void filteredArrayList(ArrayList<Integer> numbers) {
    System.out.println("\nYour filtered list is: ");
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.print(number + ", ");
      }
    }
  }
}
