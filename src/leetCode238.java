//238. Product of Array Except Self
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Example 1: Input: nums = [1,2,3,4], Output: [24,12,8,6]
//Example 2: Input: nums = [-1,1,0,-3,3], Output: [0,0,9,0,0]

import java.util.*;

public class leetCode238 {
    public static void main(String[] args) {

        System.out.println("enter the size of the array");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int nums[] = new int[size];
            int output[] = new int[size];

            System.out.print("enter the elements in the array ");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < nums.length; i++) {
                output[i] = 1;
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        output[i] = nums[j] * output[i];
                    } else {
                        continue;
                    }
                }
            }
            System.out.print("the resulting  is ");
            for (int k = 0; k < nums.length; k++) {
                System.out.print(output[k] + " ");
            }

        }
    }
}