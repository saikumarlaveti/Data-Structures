package Leetcode;

import java.util.Arrays;

public class LC_1480_RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));  // 1 2 3 4
        int[] result = runningSum(arr);
        System.out.println(Arrays.toString(result)); // 1 3 6 10
    }
}
