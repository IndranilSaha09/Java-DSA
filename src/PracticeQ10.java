// 2 numbers are entered by user, lets say X and N. 
//write a function to find the value of X to the power N. i.e one number raised to the power of another.

import java.util.*;

public class PracticeQ10 {
    public static void main(String[] args) {
        System.out.println("enter the first number: ");
        System.out.println("enter the second number: ");
        try (Scanner sc = new Scanner(System.in)) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println(
                    "the second number raised to the power of the first number results in: " + powNUm(num1, num2));
        }
    }

    public static double powNUm(double a, double b) {
        double result = 0;
        result = Math.pow(a, b);
        return result;
    }
}