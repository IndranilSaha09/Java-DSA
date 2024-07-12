// 283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1: Input: nums = [0,1,0,3,12], Output: [1,3,12,0,0]
//Example 2: Input: nums = [0], Output: [0]

import java.util.*;

public class leetCode283 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("enter the size of the array");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int nums[] = new int[size];
            int output[] = new int[size];

            System.out.println("enter the elements in an array");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            int m = 0;
            for (int i = 0; i < size; i++) {
                if (nums[i] == 0) {
                    count++;
                } else {
                    output[m] = nums[i];
                    m++;
                }
            }
            for (int k = 0; k < count; k++) {
                output[m] = 0;
                m++;
            }
            System.out.println("The modified array is ");
            for (int i = 0; i < size; i++) {
                System.out.print(output[i] + " ");
            }
        }
    }
}