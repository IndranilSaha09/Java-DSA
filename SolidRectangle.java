import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {
        System.out.println("enter the length of the rectangle ");
        System.out.println("enter the breadth of the rectangle ");
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();

            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <= breadth; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }

    }
}
