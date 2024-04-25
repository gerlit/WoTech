import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number = (int) (Math.random() * 100);
    System.out.println("Guess the number between 0-100: ");
    int guess = scanner.nextInt();

    result(number, guess);

    scanner.close();
  }

  public static void result(int number, int guess) {
    Scanner scanner = new Scanner(System.in);

    int guesses = 5;

    for (int i = 0; i < guesses; i++){
      if (guess < 0 || guess > 100){
        System.out.println("\nPlease choose a number between 0 and 100.");
        System.out.print("Guess another number: ");
        guess = scanner.nextInt();
      } else if (guess < number) {
        System.out.println("\nThe number is bigger, guess again.");
        System.out.print("Guess another number: ");
        guess = scanner.nextInt();
      } else if (guess > number) {
        System.out.println("\nThe number is smaller, guess again.");
        System.out.print("Guess another number: ");
        guess = scanner.nextInt();
      } else if (guess == number) {
        System.out.println("\nCongratulations, you guessed the number");
        break;
      }

      if (i == guesses - 1 && guess != number) {
        System.out.println("\nYou are out of guesses");
      } else if (i == guesses - 1 && guess == number) {
        System.out.println("\nCongratulations, you guessed the number");
      }
    }

    scanner.close();
  }

}
