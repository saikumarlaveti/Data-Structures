package Leetcode;

public class LC_3512_minOperations
{
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum<k){
            return sum;
        }
        else{
            return sum%k;
        }
    }
}
//https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/submissions/1675252882