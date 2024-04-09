package leetcode.ValidPalindrome;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String s) {
        String notReversed = s.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(notReversed);
        String reversed = sb.reverse().toString().toLowerCase();

        return notReversed.equals(reversed);
    }
}
