// write a function to print the sum of all odd numbers from 1 to n; n is the limit given by user

import java.util.*;

public class PracticeQ4 {
    public static void main(String[] args) {
        System.out.println("enter the upper limit: ");
        try (Scanner sc = new Scanner(System.in)) {
            int lim = sc.nextInt();
            System.out.println("the sum of all odd numbers till the given limit is : " + oddSum(lim));
        }
    }

    public static int oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }
}