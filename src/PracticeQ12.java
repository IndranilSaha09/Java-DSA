// write a function that calculates the fibonacci series upto n terms, where n is the limit given by user.

import java.util.*;

public class PracticeQ12 {
    public static void main(String[] args) {
        System.out.println("enter the number of terms of fibonacci series: ");
        try (Scanner sc = new Scanner(System.in)) {
            int lim = sc.nextInt();
            fiboNum(lim);
        }
    }

    public static void fiboNum(int a) {
        int start = 0;
        int first = 1;
        int next = 0;
        System.out.print(start + " " + first + " ");
        for (int i = 1; i < a - 1; i++) {
            next = start + first;
            System.out.print(next + " ");
            start = first;
            first = next;
        }

    }
}