package leetcode.PalindromeNumber9;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-23));
        System.out.println(isPalindrome(323));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length();

        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }
}

