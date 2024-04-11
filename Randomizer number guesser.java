import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number = (int) (Math.random() * 100);
    System.out.println("Guess the number between 0-100: ");
    int guess = scanner.nextInt();

    while (guess != number){
      if (guess < 0 || guess > 100){
        System.out.println("\nPlease choose a number between 0 and 100.");
      } else if (guess < number) {
        System.out.println("\nThe number is bigger, guess again.");
      } else if (guess > number) {
        System.out.println("\nThe number is smaller, guess again.");
      } 
      System.out.print("Guess another number: ");
      guess = scanner.nextInt();
    }
    if (guess == number){
      System.out.println("\nCongratulations, you guessed the number");
    }
  }
}
