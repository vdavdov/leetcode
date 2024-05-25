package leetcode.ValidParenthest20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private static Solution solution;
    private static String firstTest;
    private static String secondTest;

    @BeforeAll
    static void setUp() {
        solution = new Solution();
        firstTest = "(}[)";
        secondTest = "(){}[]";
    }

    @Test
    void whenNotValidParenthesesThenReturnFalse() {
        Assertions.assertFalse(solution.isValid(firstTest));
    }

    @Test
    void whenValidParenthesesThenReturnTrue() {
        Assertions.assertTrue(solution.isValid(secondTest));
    }
}