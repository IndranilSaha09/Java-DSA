// write a function that takes in the age as input and returns if the person is eligible to vote or not. age >= 18: means eligible to vote

import java.util.*;

public class PracticeQ7 {
    public static void main(String[] args) {
        System.out.println("enter your age ");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            voteBank(age);
        }
    }

    public static void voteBank(int n) {
        if (n < 18 && n > 0)
            System.out.println("you are not eligible to vote");
        else if (n >= 18)
            System.out.println("you are eligible to vote");
        else
            System.out.println("invalid age");
        return;
    }
}