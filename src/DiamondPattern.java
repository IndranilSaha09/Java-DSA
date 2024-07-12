import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();

            for (int i = 1; i <= (row / 2); i++) // 1st half
            {
                for (int k = 1; k <= row - i; k++) // for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= ((2 * i) - 1); j++) // for stars
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = (row / 2); i >= 1; i--) // 2nd half
            {
                for (int k = 1; k <= row - i; k++) // for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= ((2 * i) - 1); j++) // for stars
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}