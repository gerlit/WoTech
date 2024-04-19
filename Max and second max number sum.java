public class Main {
  public static void main(String[] args) {

    int[] numbers = {-10, 350, -8, 20, 1};
    
    int max = numbers[0];
    int secondMax = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i]>max){
        max = numbers[i];
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i]>secondMax && numbers[i]!=max){
        secondMax = numbers[i];
      }
    }

    int sum = max + secondMax;

    System.out.println("The highest number is " + max);
    System.out.println("The second highest number is " + secondMax);

    System.out.println("\nThe sum of the two largest numbers of the array is " + sum);
  }
}
