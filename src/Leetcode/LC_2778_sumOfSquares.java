package Leetcode;

public class LC_2778_sumOfSquares {
    public int sumOfSquares(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for(int i = 1;i<=length;i++){
            if(length%i ==0){
                sum += nums[i-1] * nums[i-1];
            }
        }
        return sum;
    }
}
//https://leetcode.com/problems/sum-of-squares-of-special-elements/submissions/1678540932
