// Take an array as input from the user. Search for a given number x and print the index at which it occurs. 
// Linear Search technique

import java.util.*;

public class arrayQ1 {
    public static void main(String[] args) {
        System.out.println("enter the size of the array ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] marks = new int[size];

            for (int i = 0; i < size; i++) {
                marks[i] = sc.nextInt();
            }

            System.out.println("enter the element to be searched ");
            int element = sc.nextInt();
            int count = 0;
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] == element) {
                    System.out.println("The index of " + marks[i] + " is " + i);
                    count = count + 1;
                }
            }
            if (count == 0)
                System.out.println("element not found in the array");
        }
    }
}
