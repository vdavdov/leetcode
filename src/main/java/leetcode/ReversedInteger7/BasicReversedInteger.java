package leetcode.ReversedInteger7;

class BasicReversedInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(1999999999));
        System.out.println(reverse(32329));
    }
    public static int reverse(int x) {
        var reversed = 0L;
        var digit = 0;

        while (x != 0) {
            digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }
}
