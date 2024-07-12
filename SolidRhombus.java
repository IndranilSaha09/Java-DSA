import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int k = 1; k <= (row - i); k++) // for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= row; j++) // for stars
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}