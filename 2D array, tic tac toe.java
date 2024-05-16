import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[][] array = new char[3][3];
    char value = '-';
    int counter = 1;
    int number = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = value;
      }
    }

    System.out.println("Welcome to Tic Tac Toe!");

    while (number < 9) {

      if (counter == 1) {
        System.out.println("Player 1 (X), enter the row:");
        int row1 = scanner.nextInt();
        System.out.println("Enter the column:");
        int column1 = scanner.nextInt();

        if (array[row1][column1] != 'X' && array[row1][column1] != 'O') {
          array[row1][column1] = 'X';
          counter = counter + 1;
          number = number + 1;
        } else {
          System.out.println("This slot is already taken.");
        }

        printArray(array);

        if (checkWin(array, 'X')) {
          System.out.println("Player 1 (X) wins!");
          break;
        }
        if (number == 9) {
          System.out.println("It's a draw!");
          break;
        }
      } else if (counter == 2) {
        System.out.println("Player 2 (O), enter the row:");
        int row2 = scanner.nextInt();
        System.out.println("Enter the column:");
        int column2 = scanner.nextInt();

        if (array[row2][column2] != 'X' && array[row2][column2] != 'O') {
          array[row2][column2] = 'O';
          counter = counter - 1;
          number = number + 1;
        } else {
          System.out.println("This slot is already taken.");
        }

        printArray(array);

        if (checkWin(array, 'O')) {
          System.out.println("Player 2 (O) wins!");
          break;
        }
        if (number == 9) {
          System.out.println("It's a draw!");
          break;
        }
      }
    }
    scanner.close();
  }

  public static void printArray(char[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "|");
      }
      System.out.println();
    }
  }

  public static boolean checkWin(char[][] array, char player) {
    for (int i = 0; i < 3; i++) {
      if ((array[i][0] == player && array[i][1] == player && array[i][2] == player) ||
          (array[0][i] == player && array[1][i] == player && array[2][i] == player)) {
        return true;
      }
    }
    if ((array[0][0] == player && array[1][1] == player && array[2][2] == player) ||
        (array[0][2] == player && array[1][1] == player && array[2][0] == player)) {
      return true;
    }
    return false;
  }
}
