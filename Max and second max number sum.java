public class Main {
  public static void main(String[] args) {

    int[] numbers = {2, 3, 1, 5, 4};
    
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

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
