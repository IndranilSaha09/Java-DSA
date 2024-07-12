import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("enter the length of the rectangle ");
        System.out.println("enter the breadth of the rectangle ");
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();

            for (int i = 1; i <= length; i++) {
                if (i == 1 || i == length) {
                    for (int j = 1; j <= breadth; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = 1; j <= breadth; j++) {
                        if (j == 1 || j == breadth) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }
                }
                System.out.println(" ");
            }
        }

    }
}
