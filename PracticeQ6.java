// write a function that takes in radius as input and returns the circumference of the circle

import java.util.*;

public class PracticeQ6 {
    public static void main(String[] args) {
        System.out.println("enter the radius ");
        try (Scanner sc = new Scanner(System.in)) {
            int rad = sc.nextInt();
            System.out.println("the circumference of the circle is : " + circumCircle(rad));
        }
    }

    public static double circumCircle(int n) {
        double pi = Math.PI;
        return (2 * pi * n);
    }
}