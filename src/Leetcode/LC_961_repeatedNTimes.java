package Leetcode;

public class LC_961_repeatedNTimes {
    public int repeatedNTimes(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }
    
}
//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/submissions/1708741309