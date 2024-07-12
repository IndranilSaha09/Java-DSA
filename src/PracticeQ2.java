// write a program to calculate the factorial of a number given by user

import java.util.*;

public class PracticeQ2 {
    public static void main(String[] args) {
        System.out.println("enter the number whose factorial you want to find: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num < 0)
                System.out.println("factorial can't be evaluated for negative numbers");
            else
                System.out.println("the factorial is " + factorial(num));
        }
    }

    public static int factorial(int a) {
        int product = 1;
        if (a == 0)
            return 1;
        else {
            for (int i = 1; i <= a; i++) {
                product = product * i;
            }
            return product;
        }
    }
}
