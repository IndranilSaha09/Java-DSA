import java.util.*;

public class SumofNatural {
    public static void main(String[] args) {
        System.out.println("enter the number of natural numbers whose sum is to be calculated ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println("the total sum is " + sum);

        }
    }
}
