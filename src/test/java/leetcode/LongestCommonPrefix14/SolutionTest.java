package leetcode.LongestCommonPrefix14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private static Solution solution;
    private static String[] firstTest;
    private static String[] secondTest;
    private static String[] thirdTest;

    @BeforeAll
    public static void setUp() {
        firstTest = new String[]{"flower", "flow", "flight"};
        secondTest = new String[]{"dog", "racecar", "car"};
        thirdTest = new String[]{""};
        solution = new Solution();
    }

    @Test
    void whenPutWithPrefixThenPrefix() {
        Assertions.assertEquals("fl", solution.longestCommonPrefix(firstTest));
    }

    @Test
    void whenPutWithNoPrefixThenNoPrefix() {
        Assertions.assertEquals("", solution.longestCommonPrefix(secondTest));
    }

    @Test
    void whenPutEmptyStringThenEmptyString() {
        Assertions.assertEquals("", solution.longestCommonPrefix(thirdTest));
    }
}