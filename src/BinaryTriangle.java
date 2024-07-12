import java.util.*;

public class BinaryTriangle {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) // outer loop for row
            {
                for (int j = 1; j <= i; j++) // inner loop for column
                {
                    if ((i + j) % 2 == 0) // if some of cell indexes is odd, thne print 0, else print 1
                        System.out.print(1);
                    else
                        System.out.print(0);
                }
                System.out.println();
            }
        }
    }
}