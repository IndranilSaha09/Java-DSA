import java.util.*;

public class PalindromicPattern {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int k = 1; k <= (row - i); k++) // for spaces
                {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) // for 1st half of the numbers
                {
                    System.out.print(j);
                }
                for (int j = 2; j <= i; j++) // for 2nd half of the numbers
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}