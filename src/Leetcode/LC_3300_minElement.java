package Leetcode;

public class LC_3300_minElement {
    public int minElement(int[] nums) {

        int low=nums[0];
        for(int i = 0;i<nums.length;i++){
            int temp = nums[i];
            int sum = 0;
            while(temp>0){
                int digit = temp % 10;
                sum += digit;
                temp /=10;
            }
            if(low>sum)
                low =  sum;
        }
        return low;
    }
}
//https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/submissions/1677475726
