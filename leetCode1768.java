//1768. Merge Strings Alternately
//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string. Return the merged string.
// Example 1 - word1: abc, word2: pqr, merged: apbqcr
// Example 2 - word1: a, word2: pqr, merged: apqr
// Example 3 - word1: abc, word2: p, merged: apbc

import java.util.*;

public class leetCode1768 {
    public static void main(String[] args) {
        String result = " ";
        System.out.println("enter the first word: ");
        try (Scanner sc = new Scanner(System.in)) {
            String word1 = sc.nextLine();
            System.out.println("enter the second word: ");
            String word2 = sc.nextLine();

            if (word1.length() == word2.length()) {
                for (int i = 0; i < word1.length(); i++) {
                    result = result + word1.charAt(i) + word2.charAt(i);
                }
                System.out.println("the merged word is " + result);
            } else if (word1.length() > word2.length()) {
                for (int i = 0; i < word2.length(); i++) {
                    result = result + word1.charAt(i) + word2.charAt(i);
                }
                for (int j = word2.length(); j < word1.length(); j++) {
                    result = result + word1.charAt(j);
                }
                System.out.println("the merged word is " + result);
            } else {
                for (int i = 0; i < word1.length(); i++) {
                    result = result + word1.charAt(i) + word2.charAt(i);
                }
                for (int j = word1.length(); j < word2.length(); j++) {
                    result = result + word2.charAt(j);
                }
                System.out.println("the merged word is " + result);
            }
        }
    }
}
