public class Main {
  public static void main(String[] args) {
      var vehicle1 = new Vehicle("Porsche", "911 GT2", 1998, "yellow", true);

      System.out.println(vehicle1.brand);
      System.out.println(vehicle1.model);
      System.out.println(vehicle1.year);
      System.out.println(vehicle1.color);
      System.out.println(vehicle1.iOwn);

    var vehicle2 = new Vehicle("Toyota", "GT86", 2018, "black", true);

    System.out.println(vehicle2.brand);
    System.out.println(vehicle2.model);
    System.out.println(vehicle2.year);
    System.out.println(vehicle2.color);
    System.out.println(vehicle2.iOwn);

    var vehicle3 = new Vehicle("Volkswagen", "Passat", 2004, "black", false);

    System.out.println(vehicle3.brand);
    System.out.println(vehicle3.model);
    System.out.println(vehicle3.year);
    System.out.println(vehicle3.color);
    System.out.println(vehicle3.iOwn);

  }
}

public class Vehicle{
    public String brand;
    public String model;
    public int year;
    public String color;
    public boolean iOwn;

    public Vehicle(String brand, String model, int year,String color, boolean iOwn){
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.color = color;
      this.iOwn = iOwn;
    }
}
