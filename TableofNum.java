import java.util.*;

public class TableofNum {
    public static void main(String[] args) {
        System.out.println("enter the number whose table you want to find out ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int i = 1;
            int product = 1;

            System.out.println("the mutiplication table of " + num + "is as follows - ");
            while (i <= 10) {
                product = num * i;
                i++;
                System.out.println(product);
            }
        }
    }

}
