// Take an array of numbers as input and check whether the array is in sorted in ascending order or not.

import java.util.*;

public class arrayQ3 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("enter the size of the array ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] marks = new int[size];

            for (int i = 0; i < size; i++) {
                marks[i] = sc.nextInt();
            }

            for (int i = 0; i < marks.length - 1; i++) {
                if (marks[i] > marks[i + 1])
                    count = count + 1;
            }
            if (count == 0)
                System.out.println("the array is sorted in ascending order");
            else
                System.out.println("the array is not sorted in ascending order");
        }
    }
}
