// Input a String from the user. 
//Create a new string called 'result' in which you will replace the letter 'e' in the original string wih 'i'.
// E,g - 1) 'Apple' will changed to 'Appli' 2) 'XYZ' will remain 'XYZ'

import java.util.*;

public class StringQ2 {
    public static void main(String[] args) {
        String newWord = "";
        System.out.println("enter the word you want to: ");
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'e') {
                    newWord = newWord + 'i';
                } else {
                    newWord = newWord + Character.toString(word.charAt(i));
                }
            }
            System.out.println("the modified string is " + newWord);
        }
    }
}
