import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService = new ItemService();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Press 1, to add an item");
            System.out.println("Press 2, to print all items");
            int action = scanner.nextInt();
            // If the user chooses 1, then we call addItem();
            if (action == 1) {
                addItem();
            } else if (action == 2) {
                printItems();
            } else {
                break;
            }
        }
    }

    public static void addItem() {
        System.out.println("Provide an item id");
        int id = scanner.nextInt();
        System.out.println("Provide an item name");
        String name = scanner.next();
        System.out.println("Provide an item cost");
        int cost = scanner.nextInt();
        var item = new Item(id, name, cost);
        itemService.addItem(item);
    }

    public static void printItems() {
        System.out.println("These are the items in the storage");
        var items = itemService.getItems();
        for (var item : items) {
            System.out.println(item.getId() + item.getName() + item.getCost());
        }
    }

}

public class Item{
  private int id;
  private String name;
  private int cost;

  public Item(int id, String name, int cost){
    this.id = id;
    this.name = name;
    this.cost = cost;
  }

  public int getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setCost(int cost){
    // Check whether or not the user is a cashier, and if it is, then allow to change the cost.
    this.cost = cost;
  }

  public int getCost(){
    return cost;
  }
}

import java.util.ArrayList;

public class Shop {

  //Item service functionality in different class
  // adding items
  // remove items
  // update items
  // get items

  // Shop functionality
  // AddItemToCart -> done
  // Get the items list -> done
  // RemoveItemFromCart -> future
  // Checkout (get the totalPrice)

  private ArrayList<Item> cart = new ArrayList<Item>();


  public void addItemToCart(Item item) {
    // items list, it would contain the amount of available items
    // Before we add item to the cart, we would check whether or not it is available
    cart.add(item);
  }

  public int checkout() { // get the total cost
    int sum = 0;
    for (var item : cart) {
      sum += item.getCost();
    }
    return sum;
  }

}

import java.util.ArrayList;

public class ItemService{
  private ArrayList<Item> items = new ArrayList<Item>();

  public ArrayList<Item> getItems() {
    return items;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(int id) {
    for (var item : items) {
      if (item.getId() == id) {
        items.remove(item);
        return;
      }
    }
  }

  public void updateItem(int id, String name, int cost) {
    for (var item : items) {
      if (item.getId() == id) {
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }
}
