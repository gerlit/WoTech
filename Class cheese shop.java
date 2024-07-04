import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CheeseShop cheeseShop = new CheeseShop();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Press 1, to add a cheese");
            System.out.println("Press 2, to remove a cheese");
            System.out.println("Press 3, to update a cheese");
            System.out.println("Press 4, to view all cheeses");
            System.out.println("Press 5, to add cheese to cart");
            System.out.println("Press 6, to remove cheese from cart");
            System.out.println("Press 7, to view cart");
            System.out.println("Press 8, to checkout");
            System.out.println("Press 9, to exit");
            int action = scanner.nextInt();
            if (action == 1) {
                addCheese();
            } else if (action == 2) {
                removeCheese();
            } else if (action == 3) {
                updateCheese();
            } else if (action == 4) {
                printCheeses();
            } else if (action == 5) {
                addCheeseToCart();
            } else if (action == 6) {
                removeCheeseFromCart();
            } else if (action == 7) {
                printCart();
            } else if (action == 8) {
                checkout();
            } else {
                break;
            }
        }
    }

    public static void addCheese() {
        System.out.println("Provide a cheese id");
        int id = scanner.nextInt();
        System.out.println("Provide a cheese name");
        String name = scanner.next();
        System.out.println("Provide a cheese cost");
        int cost = scanner.nextInt();
        var cheese = new Cheese(id, name, cost);
        cheeseShop.getCheeseService().addCheese(cheese);
    }

    public static void removeCheese() {
        System.out.println("Provide a cheese id to remove");
        int id = scanner.nextInt();
        cheeseShop.getCheeseService().removeCheese(id);
    }

    public static void updateCheese() {
        System.out.println("Provide a cheese id to update");
        int id = scanner.nextInt();
        System.out.println("Provide a new cheese name");
        String name = scanner.next();
        System.out.println("Provide a new cheese cost");
        int cost = scanner.nextInt();
        cheeseShop.getCheeseService().updateCheese(id, name, cost);
    }

    public static void printCheeses() {
        System.out.println("Available cheeses in the shop:");
        var cheeses = cheeseShop.getAvailableCheeses();
        for (var cheese : cheeses) {
            System.out.println(cheese.getId() + " " + cheese.getName() + " " + cheese.getCost());
        }
    }

    public static void addCheeseToCart() {
        System.out.println("Provide a cheese id to add to cart");
        int id = scanner.nextInt();
        var cheeses = cheeseShop.getAvailableCheeses();
        for (var cheese : cheeses) {
            if (cheese.getId() == id) {
                cheeseShop.addCheeseToCart(cheese);
                break;
            }
        }
    }

    public static void removeCheeseFromCart() {
        System.out.println("Provide a cheese id to remove from cart");
        int id = scanner.nextInt();
        cheeseShop.removeCheeseFromCart(id);
    }

    public static void printCart() {
        System.out.println("Cheeses in the cart:");
        var cart = cheeseShop.getCart();
        for (var cheese : cart) {
            System.out.println(cheese.getId() + " " + cheese.getName() + " " + cheese.getCost());
        }
    }

    public static void checkout() {
        int totalCost = cheeseShop.checkout();
        System.out.println("Total cost: " + totalCost);
    }
}

public class Cheese {
    private int id;
    private String name;
    private int cost;

    public Cheese(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}

import java.util.ArrayList;

public class CheeseService {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public void removeCheese(int id) {
        for (var cheese : cheeses) {
            if (cheese.getId() == id) {
                cheeses.remove(cheese);
                return;
            }
        }
    }

    public void updateCheese(int id, String name, int cost) {
        for (var cheese : cheeses) {
            if (cheese.getId() == id) {
                cheese.setName(name);
                cheese.setCost(cost);
                return;
            }
        }
    }
}

import java.util.ArrayList;

public class CheeseShop {
    private ArrayList<Cheese> cart = new ArrayList<>();
    private CheeseService cheeseService = new CheeseService();

    public void addCheeseToCart(Cheese cheese) {
        cart.add(cheese);
    }

    public void removeCheeseFromCart(int id) {
        for (var cheese : cart) {
            if (cheese.getId() == id) {
                cart.remove(cheese);
                return;
            }
        }
    }

    public ArrayList<Cheese> getCart() {
        return cart;
    }

    public ArrayList<Cheese> getAvailableCheeses() {
        return cheeseService.getCheeses();
    }

    public int checkout() {
        int sum = 0;
        for (var cheese : cart) {
            sum += cheese.getCost();
        }
        return sum;
    }

    public CheeseService getCheeseService() {
        return cheeseService;
    }
}

