import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int half = row / 2;

            for (int i = 1; i <= half; i++) // 1st half
            {
                for (int j = 1; j <= i; j++) // for 1st part of stars in the first half
                {
                    System.out.print("*");
                }
                for (int k = 1; k <= (2 * (half - i)); k++) // for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) // for 2nd part of stars in the second half
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = half; i >= 1; i--) // 2nd half
            {
                for (int j = i; j >= 1; j--) // for 1st part of stars in the 2nd half
                {
                    System.out.print("*");
                }
                for (int k = 1; k <= (2 * (half - i)); k++) // for spaces
                {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) // for 2nd part of stars in the 2nd half
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}