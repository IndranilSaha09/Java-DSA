// Take an array and find the maximum and minimum number in that array.

import java.util.*;

public class arrayQ2 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE; // minimum value that an integer can hold
        int min = Integer.MAX_VALUE; // maximum value that an integer can hold
        System.out.println("enter the size of the array ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] marks = new int[size];

            for (int i = 0; i < size; i++) {
                marks[i] = sc.nextInt();
            }

            for (int i = 0; i < marks.length; i++) {
                if (marks[i] > max)
                    max = marks[i];
                else if (marks[i] == max)
                    max = marks[i];
                else
                    break;
            }
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] < min)
                    min = marks[i];
                else if (marks[i] == min)
                    min = marks[i];
                else
                    break;
            }
            System.out.println("the maximum number in this array is " + max);
            System.out.println("the minimum number in this array is " + min);
        }
    }
}
