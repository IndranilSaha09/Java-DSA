// Take an array of strings input from the user and find the cumulative length of all strings

import java.util.*;

public class StringQ1 {
    public static void main(String[] args) {

        String word;
        int count = 0;
        System.out.println("enter the number of words: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = Integer.parseInt(sc.nextLine());
            String[] box = new String[num];
            System.out.println("enter the words: ");
            for (int i = 0; i < box.length; i++) {
                box[i] = sc.nextLine();
            }
            for (int i = 0; i < box.length; i++) {
                word = box[i];
                count = count + word.length();
            }
        }
        System.out.println("the cumulative length of all strings are: " + count);
    }

}
