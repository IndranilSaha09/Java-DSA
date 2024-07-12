
// write a program to enter the numbers till the user wants and at the end, it should display the count of positive, negative and zeroes entered.
import java.util.*;

public class PracticeQ9 {
    public static void main(String[] args) {
        int count = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (count != 0) {
                System.out.println("do you want to enter a number: yes or no? ");
                String answer = sc.next();
                if (answer.equals("yes")) {
                    count++;
                    System.out.println("enter the number");
                    int num = sc.nextInt();
                    if (num > 0)
                        a = a + 1;
                    else if (num < 0)
                        b = b + 1;
                    else
                        c = c + 1;
                } else if (answer.equals("no")) {
                    System.out.println("Ok, Thank you !!");
                    count = 0;
                } else {
                    System.out.println("Invalid choice");
                    count = 0;
                }
            }
        }
        System.out.println("the count of positive numbers is " + a);
        System.out.println("the count of negative numbers is " + b);
        System.out.println("the count of zeroes is " + c);
    }
}