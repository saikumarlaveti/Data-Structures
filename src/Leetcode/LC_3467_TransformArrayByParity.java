package Leetcode;

import java.util.Arrays;

public class LC_3467_TransformArrayByParity {
    public static int[] transformArray(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return(nums);
    }

    public static int[] transformArray1(int[] nums) {
        int[] ans = new int[nums.length];
        int j = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            if((nums[i] &1) == 1)
                ans[j--] = 1;
        }
        return(nums);
    }

    public static void main(String[] args) {
        int[] result = {4,3,2,1};
        int[] res = transformArray(result);
        System.out.println(Arrays.toString(res));  //  [0, 0, 1, 1]

        int[] res1 = transformArray1(result);
        System.out.println(Arrays.toString(res1));
    }
}
