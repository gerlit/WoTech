public class Main {
  public static void main(String[] args) {
    int[] arr = { 8, 7, 5, 3, 2, 1 }; // current race results
    int number = 4; // our result
    int place = getThePlace(arr, number);
    System.out.println("Our place in race: " + place);
  }

  public static int getThePlace(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < number) {
        return i + 1;
      }
    }
    return arr.length + 1;
  }
}
