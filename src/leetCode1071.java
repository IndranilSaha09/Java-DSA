//1071. Greatest Common Divisor of Strings
//For two strings s and t, we say "t divides s" if and only if s = t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//Example 1: Input: str1 = "ABCABC", str2 = "ABC" ; Output: "ABC"
// Example 2: Input: str1 = "ABABAB", str2 = "ABAB" ; Output: "AB"
// Example 3: Input: str1 = "LEET", str2 = "CODE" ; Output: ""

import java.util.*;

public class leetCode1071 {
    public static void main(String[] args) {
        String result = " ";
        System.out.println("enter the first word: ");
        try (Scanner sc = new Scanner(System.in)) {
            String word1 = sc.nextLine();
            System.out.println("enter the second word: ");
            String word2 = sc.nextLine();

            if (word1.length() == word2.length()) {
                for (int i = 0; i < word1.length(); i++) {
                    if (word1.charAt(i) == word2.charAt(i)) {
                        result = result + word1.charAt(i);
                    }
                    if (word1.charAt(i) != word2.charAt(i)) {
                        break;
                    }
                }
                System.out.println("the GCD of the string is " + result);
            } else if (word1.length() > word2.length()) {
                for (int i = 0; i < word2.length(); i++) {
                    if (word1.charAt(i) == word2.charAt(i)) {
                        result = result + word1.charAt(i);
                    } else {
                        break;
                    }
                }
                System.out.println("the GCD of the string is " + result);
            } else {
                for (int i = 0; i < word1.length(); i++) {
                    if (word1.charAt(i) == word2.charAt(i)) {
                        result = result + word1.charAt(i);
                    } else {
                        break;
                    }
                }
                System.out.println("the GCD of the string is " + result);
            }
        }
    }
}
