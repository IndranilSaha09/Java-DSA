import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int k = 1; k <= (row - i); k++) // for 1st part of spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) // for numbers
                {
                    System.out.print(i + " ");
                }
                for (int k = 1; k <= (row - i); k++) // for 2nd part of spaces
                {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    }
}