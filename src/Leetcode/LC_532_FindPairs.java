package Leetcode;

import java.util.Arrays;

public class LC_532_FindPairs {
    public static int findPairs(int[] nums, int k) {
        //Arrays.sort(nums);
        int pairs = 0;
        int left = 0;
        int right = left+1;
        while(left<right && right< nums.length){
             right = left+1;
            int diff = Math.abs(nums[left] - nums[right]);
            if(diff == k ){
                pairs++;
            }
            if(diff < k){
                left++;
            }
            else{
                right--;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5},2));  //1,1,3,4,5
    }
}
