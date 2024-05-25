package leetcode.ValidParenthest20;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        char c;
        char b;
        for (int i = 0; i < s.length() - 1; i++) {
            c = s.charAt(i);
            b = s.charAt(i + 1);
            if (c == '(' && b == ')' || (c == '{' && b == '}' || (c == '[' && b == ']'))) {
                continue;
            }
            return false;
        }
        return true;
    }
}
