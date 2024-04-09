package leetcode.RomanToInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger13 {
    //    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        int res = 0;
        if (s == null) {
            return res;
        }
        HashMap<String, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);

        String[] split = s.split("");
        List<Integer> integerList = new ArrayList<>();

        for (String string : split) {
            integerList.add(romanNumbers.get(string));
        }
        int previous = 0;
        for (int i = integerList.size() - 1; i >= 0; i--) {
            if (previous > integerList.get(i)) {
                res -= integerList.get(i);
            } else {
                res += integerList.get(i);
            }
            previous = integerList.get(i);
        }

        return res;
    }
}
