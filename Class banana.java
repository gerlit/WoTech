public class Main {
    public static void main(String[] args) {
        var banana = new Banana("Medium", "Brown");

        System.out.println("This banana is " + banana.size + " sized and " + banana.color + " in color.");

        for(int i = 0; i < 2; i++){
          banana.bite();
        }
        System.out.println("You have " + banana.bites + " bites left from your banana.");
    }
}

public class Banana{
  public String size;
  public String color;
  public int bites = 10;

  public Banana(String size, String color){
    this.size = size;
    this.color = color;
  }

  public void bite(){
    bites = bites - 1;
  }
}
