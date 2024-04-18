public class Main {
  public static void main(String[] args) {
    int[] numbers = {22, 47,1, 5, 2};

    boolean ifFound = false;

    System.out.println("Here are all numbers below zero: ");
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < 0) {
        System.out.println(numbers[i]);
        ifFound = true;
      }
    }

    if (ifFound == false){
      System.out.println("None");
    }
    
  }
}
