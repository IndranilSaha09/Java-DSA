//605. Can Place Flowers
//You have a long flowerbed in which some of the plots are planted, and some are not. 
//However, flowers cannot be planted in adjacent plots.
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
//return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

//Example 1: Input: flowerbed = [1,0,0,0,1], n = 1; Output: true
// Example 2: Input: flowerbed = [1,0,0,0,1], n = 2; Output: false

import java.util.*;

public class leetCode605 {
    public static void main(String[] args) {
        int count = 0;
        boolean result;

        System.out.println("enter the length of the flowerbed ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int flowerbed[] = new int[num];

            System.out.println("enter the number of flowers you want to plant ");
            int newFlower = sc.nextInt();

            System.out.println("enter 0 if the pot is empty and 1 if the pot is not empty");
            for (int i = 0; i < num; i++) {
                flowerbed[i] = sc.nextInt();
            }

            for (int i = 0; i < num; i++) {
                if (i == 0) {
                    if (flowerbed[i] == 1)
                        count = count * 1;
                    else {
                        if (flowerbed[i + 1] == 1)
                            count = count * 1;
                        else
                            count++;
                    }
                } else if (i == num - 1) {
                    if (flowerbed[i] == 1)
                        count = count * 1;
                    else {
                        if (flowerbed[i - 1] == 1)
                            count = count * 1;
                        else
                            count++;
                    }
                } else {
                    if (flowerbed[i] == 1)
                        count = count * 1;
                    else {
                        if (flowerbed[i - 1] == 1 && flowerbed[i + 1] == 0)
                            count = count * 1;
                        else
                            count++;
                    }
                }
            }
            if (count >= newFlower)
                result = true;
            else
                result = false;

            System.out.println(result);
        }
    }
}