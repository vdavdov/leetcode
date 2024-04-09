package leetcode.TwoSum;

import java.util.Arrays;

class TwoSumArrayOptimize {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 5;
        System.out.println(Arrays.toString(TwoSumArrayOptimize.twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for(int i = 1; i < length;i++) {
            for (int j = i; j < length;j++) {
                if (target - nums[j-i] == nums[j]) {
                    return new int[] {j-i, j};
                }
            }
        }
        return null;
    }
}
