package Leetcode;

public class LC_485_MaxOfConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1)
                count++;
            else{
                if(max < count)
                    max = Math.max(count,max);
                count = 0;
            }
        }

        return Math.max(count,max) ;
    }
}
