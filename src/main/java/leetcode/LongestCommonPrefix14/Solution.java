package leetcode.LongestCommonPrefix14;

import java.util.Arrays;

public class Solution {
//    public static void main(String[] args) {
//        System.out.println("prefix is: " + longestCommonPrefix(new String[]{""}));
//        System.out.println("prefix is: " + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        System.out.println("prefix is: " + longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
//    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;

        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                return first.substring(0, index);
            }
        }
        return first.substring(0, index);
    }
}
