package Leetcode;

import java.util.Arrays;

public class LC_1464_maxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1) *(nums[nums.length-2]-1);
    }
}
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/submissions/1677492516
