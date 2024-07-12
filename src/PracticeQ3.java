// Enter 3 numbers from user and make a function to print their average

import java.util.*;

public class PracticeQ3 {
    public static void main(String[] args) {
        System.out.println("enter the first number: ");
        System.out.println("enter the second number: ");
        System.out.println("enter the third number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            System.out.println("the average of the numbers is: " + avgNum(num1, num2, num3));
        }
    }

    public static int avgNum(int a, int b, int c) {
        int avg = 0;
        avg = (a + b + c) / 3;
        return avg;
    }
}
