package Leetcode;

import java.util.Arrays;

public class LC_2441_findMaxK {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length-1;
        int i = 0;
        while(i<nums.length){
            for(int j = 0;j<nums.length;j++){
                int maxElement = nums[length];
                if(maxElement +nums[j] == 0){
                    return maxElement;
                }
            }
            length--;
            i++;
        }
        return -1;
    }
}
//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/submissions/1680045031
