package LeetcodeConcepts.PrefixSum;

import java.util.Arrays;

public class RightSum {
    public static int[] RightSum(int[] nums) {
        int result[] = new int[nums.length];
        for(int i = nums.length-2;i>=0;i--){
            result[i] = nums[i+1] + result[i+1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(RightSum(nums)));  // [15, 11, 3, 0]
    }
}