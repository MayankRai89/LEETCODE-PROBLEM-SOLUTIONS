// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

import java.util.*;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                b.append(s.charAt(i));
            }
        }
        System.out.println(b);

        int n = b.length() - 1;
        for (int i = 0; i < b.length() / 2; i++) {
            if (b.charAt(i) != b.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Valid_Palindrome sol = new Valid_Palindrome(); // create object
        String s = "A man, a plan, a canal: Panama";
        boolean solution = sol.isPalindrome(s); // call method using object
        System.out.println(solution);
    }
}
