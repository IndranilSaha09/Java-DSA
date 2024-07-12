import java.util.*;

public class FloydTriangle {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int count = 1;

            for (int i = 1; i <= row; i++) // outer loop
            {
                for (int j = 1; j <= i; j++) // inner loop
                {
                    System.out.print(count + " "); // count is the value getting printed
                    count++; // increases by 1 every iteration of inner loop
                }
                System.out.println();
            }
        }
    }
}