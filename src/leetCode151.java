//151. Reverse Words in a String
//Given an input string s, reverse the order of the words.
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space.
//Note that s may contain leading or trailing spaces or multiple spaces between two words. 
//The returned string should only have a single space separating the words. Do not include any extra spaces.

//Example 1: Input = "the sky is blue", Output = "blue is sky the"
//Example 2: Input = " hello world ", output = "world hello"
//Example 3: Input = "a good  example", output = "example good a"
import java.util.*;

public class leetCode151 {
    public static void main(String[] args) {
        String result = "";

        System.out.println("enter a sentence");
        try (Scanner sc = new Scanner(System.in)) {
            String userInput = sc.nextLine();
            int space = userInput.length();
            for (int i = userInput.length() - 1; i >= 0; i--) {
                if (userInput.charAt(i) == ' ' && i != 0 && i != userInput.length() - 1
                        && userInput.charAt(i - 1) != ' ') {
                    result = result + userInput.substring(i + 1, space) + " ";
                    space = i;
                }
                if (userInput.charAt(i) == ' ' && i != 0 && i != userInput.length() - 1
                        && userInput.charAt(i - 1) == ' ') {
                    result = result + userInput.substring(i + 1, space);
                    space = i;
                }
                if (i == 0 && userInput.charAt(i) != ' ') {
                    result = result + userInput.substring(i, space);
                    space = i;
                }

                if (i == 0 && userInput.charAt(i) == ' ') {
                    result = result + userInput.substring(i + 1, space);
                    space = i;
                }
            }
            System.out.println(result);
        }
    }
}