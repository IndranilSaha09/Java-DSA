import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        System.out.println("enter the number of rows ");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}