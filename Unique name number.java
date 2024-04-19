public class Main {
  public static void main(String[] args) {
    
    String[] guests = { "Andris", "Oskars", "Elizabeth", "Oskars", "Elizabeth" };

    int result = 0;

    for (int i = 0; i < guests.length; i++) {
      boolean isFound = false;
      String guest = guests[i];

      for (int j = 0; j < i; j++) {
        if (guests[j].equals(guest)) {
          isFound = true;
        }
      }

      if (isFound == false) {
        result = result + 1;
      }
    }

    System.out.println("\nResult: " + result);
  }
}
