package leetcode.LongestSubstringWithoutRepeating3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwekw"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < stringLength; right++) {
            set.add(s.charAt(right));

        }

        return 0;
    }
}
