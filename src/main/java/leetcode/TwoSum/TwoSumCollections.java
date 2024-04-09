package leetcode.TwoSum;

import java.util.*;

public class TwoSumCollections {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
