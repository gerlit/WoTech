import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int hiddenRow = (int) (Math.random() * 5);
        int hiddenColumn = (int) (Math.random() * 5);
        array[hiddenRow][hiddenColumn] = 10;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Current Field:");
            printField(array);

            System.out.print("Enter the row (0-4): ");
            int row = scanner.nextInt();
            System.out.print("Enter the column (0-4): ");
            int column = scanner.nextInt();

            if (row < 0 || row >= 5 || column < 0 || column >= 5) {
                System.out.println("Invalid input! Row and column must be between 0 and 4.");
                continue;
            }

            if (array[row][column] == 10) {
                System.out.println("Congratulations! You found the hidden number 10 at row " + row + " and column " + column + ".");
                break;
            } else {
                System.out.println("Sorry, the value at row " + row + " and column " + column + " is not 10. Try again!");
                array[row][column] = -1;
            }
        }

        scanner.close();
    }

    private static void printField(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == -1) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
