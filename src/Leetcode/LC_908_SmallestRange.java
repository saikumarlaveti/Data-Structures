package Leetcode;

public class LC_908_SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
            if(nums[i]<min)
                min=nums[i];


        }

        max=max-k;
        min=min+k;
        if(min>=max){
            return 0;
        }
        return max-min;
    }
    public static void main(String[] args) {

    }
}
