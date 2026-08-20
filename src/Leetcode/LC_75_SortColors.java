package Leetcode;

public class LC_75_SortColors {
    public void sortColors(int[] nums) {
        for(int i = 0;i<=nums.length-2;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
