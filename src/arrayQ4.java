// 2D array - Take a matrix from the user. Search for a given number X and print the indices at which it ocurrs.

import java.util.*;

public class arrayQ4 {
    public static void main(String[] args) {
        int check = 0;
        System.out.println("enter the number of rows of the array ");
        System.out.println("enter the number of columns of the array ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            int[][] numbers = new int[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter a number to be searched");
            int num = sc.nextInt();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (numbers[i][j] == num) {
                        System.out.println(
                                "the searched number is present at " + (i + 1) + " row" + " and " + (j + 1)
                                        + " column");
                        check = check + 1;
                    }
                }
            }
            if (check == 0)
                System.out.println("the searched number is not present in the 2D array");

        }
    }
}
