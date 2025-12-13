package Leetcode;

import java.util.Arrays;

public class LC_905_sortArrayByParity {
    public  static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left] %2==0){
                left++;
            }
            else if(nums[right] %2 == 1)
                right--;
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        int[] result = sortArrayByParity(score);
        System.out.println(Arrays.toString(result));

    }
}
