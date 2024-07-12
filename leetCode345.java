//345. Reverse Vowels of a String
// Given a string s, reverse only all the vowels in the string and return it.
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//Example 1: Input: s = "hello", Output: "holle"
//Example 2: Input: s = "leetcode", Output: "leotcede"

import java.util.*;

public class leetCode345 {
    public static void main(String[] args) {
        String new1 = "";
        String result = "";
        int vow = 0;
        System.out.println("enter a string ");
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String userInput = input.toLowerCase();

            for (int i = userInput.length() - 1; i >= 0; i--) {
                if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i'
                        || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u')
                    new1 = new1 + userInput.charAt(i);
            }
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i'
                        || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                    result = result + new1.charAt(vow);
                    vow++;
                } else {
                    result = result + userInput.charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}