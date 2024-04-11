import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int number = 48;
    System.out.println("Guess the number between 0-100: ");
    int guess = scanner.nextInt();

    while (guess != number){
      if (guess < 0 || guess > 100){
        System.out.println("Please choose a number between 0 and 100.");
      } else if (guess < number) {
        System.out.println("The number is bigger, guess again.");
      } else if (guess > number) {
        System.out.println("The number is smaller, guess again.");
      } 
      System.out.print("Guess another number: ");
      guess = scanner.nextInt();
    }
    if (guess == number){
      System.out.println("Congratulations, you guessed the number");
    }
  }
}
