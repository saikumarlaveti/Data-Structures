package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC_18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> four = new HashSet();
        Arrays.sort(nums);
        for(int a = 0;a<nums.length-3;a++){
            for(int b = a+1;b<nums.length-2;b++){
                int left = b+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[a]+nums[b]+nums[left]+nums[right];
                    if(sum == target){
                        left++;
                        right--;
                        four.add(Arrays.asList(nums[a],nums[b],nums[left],nums[right]));
                    }
                    else if(sum > target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList(four);
    }
    public static void main(String[] args) {

    }
}
