public class Main {
  public static void main(String[] args) {    

    // up to 5 blow super warm
    // 5 to 15 blow warm
    // 15 to 30 normal temp
    // 30+ cooling

    double temperature = -3;

    if (temperature <=5) {
      System.out.println("Wear super warm clothes.");
    } else if (temperature <=15) {
      System.out.println("Wear warm clothes.");
    } else if (temperature <=30) {
      System.out.println("Wear regular clothes.");
    } else if (temperature >30) {
      System.out.println("Wear light clothes.");
    }

  }
}
