package leetcode.RomanToInteger;

public class RomanToIntegerFaster {
    public static void main(String[] args) {
        System.out.println(romanToInt("XIX"));
    }
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static int romanToInt(String s) {
        int res = 0;
        int previous = 0;
        int number = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }
            if (previous > number) {
                res -= number;
            } else {
                res += number;
            }
            previous = number;
        }
        return res;
    }
}
