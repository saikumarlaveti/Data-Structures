package Leetcode;

import java.util.Arrays;

public class LC_1679_maxOperations {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum < k){
                left++;
            }
            else if(sum>k){
                right--;
            }
            else{
                count++;
                left++;
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

//https://leetcode.com/problems/max-number-of-k-sum-pairs/submissions/1640476398