package Leetcode;

import java.util.Arrays;

public class LC_2016_MaximumDifference {
    public static int maximumDifference(int[] nums) {
        int value = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    value = Math.max(value, nums[j] - nums[i]);
                }
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,4};
        System.out.println(maximumDifference(arr));

    }
}
//https://leetcode.com/problems/maximum-difference-between-increasing-elements/submissions/1666309221