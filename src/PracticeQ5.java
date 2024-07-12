// write a function which takes 2 numbers as input and returns the greater of these two numbers

import java.util.*;

public class PracticeQ5 {
    public static void main(String[] args) {
        System.out.println("enter the first nummber ");
        System.out.println("enter the second nummber ");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 == num2)
                System.out.println("both numbers are equal");
            else
                System.out.println("the greater between these numbers is : " + greaterNum(num1, num2));
        }
    }

    public static int greaterNum(int n, int m) {
        if (n > m)
            return n;
        else
            return m;
    }
}