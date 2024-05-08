public class Main {
  public static void main(String[] args) {
  boolean isAPrimeNumber = isPrime(12);
  System.out.println(isAPrimeNumber);
    
  }
  public  static boolean isPrime(int number){
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }
}
