import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] array = new int[3][3];
    int value = 0;
    int counter = 1;
    int number = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = value;
      }
    }

    System.out.println("Welcome to tic tac toe (1 & 2 version)");

    while (number < 9) {

      if (counter == 1) {
        System.out.println("Player 1, enter the row:");
        int row1 = scanner.nextInt();
        System.out.println("Enter the column:");
        int column1 = scanner.nextInt();

        if (array[row1][column1] != 1 && array[row1][column1] != 2) {
          array[row1][column1] = 1;
          counter = counter + 1;
          number = number + 1;
        } else {
          System.out.println("This slot is already taken.");
        }

        printArray(array);

        if (checkWin(array, 1)) {
          System.out.println("Player 1 wins!");
          break;
        }
        if (number == 9) {
          System.out.println("It's a draw!");
          break;
        }
      }

      if (counter == 2) {
        System.out.println("Player 2, enter the row:");
        int row2 = scanner.nextInt();
        System.out.println("Enter the column:");
        int column2 = scanner.nextInt();

        if (array[row2][column2] != 1 && array[row2][column2] != 2) {
          array[row2][column2] = 2;
          counter = counter - 1;
          number = number + 1;
        } else {
          System.out.println("This slot is already taken.");
        }

        printArray(array);

        if (checkWin(array, 2)) {
          System.out.println("Player 2 wins!");
          break;
        }
        if (number == 9) {
          System.out.println("It's a draw!");
          break;
        }
      }
    }
  }

  public static void printArray(int array[][]) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "|");
      }
      System.out.println();
    }
  }

  public static boolean checkWin(int[][] array, int player) {
    for (int i = 0; i < 3; i++) {
      if ((array[i][0] == player && array[i][1] == player && array[i][2] == player) ||
          (array[0][i] == player && array[1][i] == player && array[2][i] == player)) {
        return true;
      }
    }
    return false;
  }
}
