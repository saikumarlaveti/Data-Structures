package Leetcode;

public class LC_3427_SubArrSum {
        public int subarraySum(int[] nums) {
            int sum = 0;
            for(int i = 0 ;i<nums.length;i++){
                int start = Math.max(0,i-nums[i]);
                for(int j = start ;j<=i;j++){
                    sum += nums[j];
                }
            }
            return sum;
    }
}

//https://leetcode.com/problems/sum-of-variable-length-subarrays/submissions/1668558733
