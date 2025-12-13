package Leetcode;

import java.util.Arrays;


public class LC_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
     int index = 1;
     for(int i = 1;i<nums.length;i++){
         if(nums[i] != nums[i-1]){
             nums[index] = nums[i] ;
             index++;
         }
     }
        System.out.println(Arrays.toString(nums));
     return nums.length;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1 , 2, 2, 3, 3, 4};
        LC_26_RemoveDuplicatesFromSortedArray rd = new LC_26_RemoveDuplicatesFromSortedArray();
        System.out.println(rd.removeDuplicates(nums));
    }
}
