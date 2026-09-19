package Leetcode;

import java.util.Arrays;

public class LC_209_MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int[] leftSum = new int[nums.length];
        Arrays.sort(nums);
        //calculated left sum
        leftSum[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            leftSum[i] = nums[i]+leftSum[i+1];
        }
        System.out.println(Arrays.toString(leftSum));
        int index = 1;
        boolean flag = false;
        for(int j = nums.length-1;j>=0;j--){
            if(leftSum[j]>=target){
                flag = true;
                return index;
            }
            index++;
        }
        return flag==true?index:0;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(213,new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
    }
}
