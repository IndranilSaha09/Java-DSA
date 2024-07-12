//1431. Kids With the Greatest Number of Candies
//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
//and an integer extraCandies, denoting the number of extra candies that you have.

//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
//they will have the greatest number of candies among all the kids, or false otherwise. 
//Note that multiple kids can have the greatest number of candies.
//Example 1: Input: candies = [2,3,5,1,3], extraCandies = 3; Output: [true,true,true,false,true] 
//Example 2: Input: candies = [4,2,1,1,2], extraCandies = 1; Output: [true,false,false,false,false]
//Example 3: Input: candies = [12,1,12], extraCandies = 10; Output: [true,false,true]  

import java.util.*;

public class leetCode1431 {
    public static void main(String[] args) {
        int max = 0;
        System.out.println("enter the number of kids ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int candies[] = new int[num];
            boolean[] result = new boolean[num];

            System.out.println("enter the number of candies that each kid shall have");
            for (int i = 0; i < num; i++) {
                candies[i] = sc.nextInt();
            }
            System.out.println("enter the number of extra candies that you have ");
            int extraCandies = sc.nextInt();

            max = candies[0];
            for (int i = 0; i < num - 1; i++) {
                if (candies[i + 1] > max) {
                    max = candies[i + 1];
                }
            }

            for (int i = 0; i < num; i++) {
                if (candies[i] + extraCandies >= max)
                    result[i] = true;
                else
                    result[i] = false;
            }

            for (int i = 0; i < num; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }
}