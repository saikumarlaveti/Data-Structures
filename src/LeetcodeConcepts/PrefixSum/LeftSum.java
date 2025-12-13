package LeetcodeConcepts.PrefixSum;

import java.util.Arrays;

public class LeftSum {
    public static int[] leftSum(int[] nums) {
        int result[] = new int[nums.length];
        for(int i = 1;i<nums.length;i++){
            result[i] = nums[i-1] + result[i-1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};  // [0, 10, 14, 22]
        System.out.println(Arrays.toString(leftSum(nums)));
    }
}
