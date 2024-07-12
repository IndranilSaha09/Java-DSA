import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("enter age: ");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if (age < 18) {
                System.out.println("you are not eligible for driving");
            } else if (age >= 18 && age <= 60) {
                System.out.println("you are perfectly eligible to drive");
            } else if (age > 60) {
                System.out.println("you are old enough to drive");
            } else {
                System.out.println("invalid input for age");
            }
        }

    }
}
