import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    int[] numbers = new int[5];
    System.out.print("Please enter your five numbers: \n");
    for (int i = 0; i < numbers.length; i++) { 
      numbers[i] = scanner.nextInt();
    }

    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i]>max){
        max = numbers[i];
      }
    }

    int min = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i]<min){
        min = numbers[i];
      }
    }

    System.out.print("\nHere is the biggest number on the list: " + max);
    System.out.print("\nHere is the smallest number on the list: " + min);

    scanner.close();
  }
}
