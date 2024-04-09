package leetcode.TwoSum;

import java.util.Arrays;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] nums = {2, 3 , 1};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int num;
        for(int i = 0; i < length;i++) {
            num = nums[i];
            for (int j = i+1; j < length;j++) {
                if (target - num == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
