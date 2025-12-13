package Leetcode;

import java.util.Arrays;

public class LC_1920_ArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
       int[] result =  buildArray(nums);
        System.out.println(Arrays.toString(result));   // [0, 1, 2, 4, 5, 3]
    }
}
