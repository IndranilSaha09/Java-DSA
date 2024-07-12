// write a function that calculates the greatest common divisor of 2 numbers.

import java.util.*;

public class PracticeQ11 {
    public static void main(String[] args) {
        System.out.println("enter the first number: ");
        System.out.println("enter the second number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("the G.C.D of these two numbers are: " + gcdNum(num1, num2));
        }
    }

    public static int gcdNum(int a, int b) {
        int rem = 0;
        if (a > b) {
            if (a % b == 0) {
                return b;
            } else {
                while (rem != 1) {
                    rem = a % b;
                    a = b;
                    b = rem;
                }
                return b;
            }
        } else if (a < b) {
            if (b % a == 0) {
                return a;
            } else {
                while (rem != 1) {
                    rem = b % a;
                    b = a;
                    a = rem;
                }
                return a;
            }
        } else {
            return a;
        }
    }
}