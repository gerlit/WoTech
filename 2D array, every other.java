public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              if ((i+1) % 2 == 0 || (j+1) % 2 == 0){
                array[i][j] = 1;
              } else {
                array[i][j] = 0;
              }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }
}
