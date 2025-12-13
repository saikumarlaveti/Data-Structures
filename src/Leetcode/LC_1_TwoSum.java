package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_1_TwoSum {
    public  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int target = 6;
        int[] nums = {3,2,4};
        LC_1_TwoSum ts = new LC_1_TwoSum();
        int[] res = ts.twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
