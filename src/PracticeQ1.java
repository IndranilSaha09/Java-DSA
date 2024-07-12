// write a function to calcualte sum, multiplication, division and substraction of two numbers based on user's choice

import java.util.*;

public class PracticeQ1 {
    public static void main(String[] args) {
        System.out.println("enter the first number ");
        System.out.println("enter the second number ");
        System.out.println("enter the operation to be performed: 1. add, 2. substract, 3. multiply, 4. division");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int option = sc.nextInt();

            if (option == 1) {
                int sum = addNum(num1, num2);
                System.out.println("the result of the sum is " + sum);
            } else if (option == 2) {
                int sub = substractNum(num1, num2);
                System.out.println("the result of the subtraction is " + sub);
            } else if (option == 3) {
                int mult = multiplyNum(num1, num2);
                System.out.println("the result of the multiplication is " + mult);
            } else if (option == 4) {
                int div = divisionNum(num1, num2);
                System.out.println("the result of the division is " + div);
            } else {
                System.out.println("Invalid option selected");
            }

        }
    }

    public static int addNum(int a, int b) {
        return a + b;
    }

    public static int substractNum(int a, int b) {
        return a - b;
    }

    public static int multiplyNum(int a, int b) {
        return a * b;
    }

    public static int divisionNum(int a, int b) {
        return a / b;
    }

}