package Leetcode;

import java.util.Arrays;

public class LC_2974_MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i=i+2){
            int Alice = nums[i];
            int Bob = nums[i+1];

            result[i] = Bob;
            result[i+1] = Alice;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(arr)));  // [3, 2, 5, 4]
    }
}
