// Input an email from the user. 
//Create an username from the email by deleting the part that comes after '@' and display the username.
// E,g - Input: indranilsaha9@gmail.com;    Output: indranilsaha9

import java.util.*;

public class StringQ3 {
    public static void main(String[] args) {
        String newWord = "";
        System.out.println("enter your email ID");
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != '@')
                    newWord = newWord + Character.toString(word.charAt(i));
                else
                    break; // terminates the flow control from the loop
            }
            System.out.println("the modified string is " + newWord);
        }
    }
}
