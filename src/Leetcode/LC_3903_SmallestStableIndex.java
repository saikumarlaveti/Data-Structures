package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LC_3903_SmallestStableIndex {
    public static int firstStableIndex(int[] nums, int k) {
        int[] maxElement = new int[nums.length];
        int[] minElement = new int[nums.length];
        int[] result = new int[nums.length];
        //Find maxElement
        maxElement[0] = nums[0];
        for(int i = 1;i<nums.length;i++) {
            int i1 = 0;
            while (i1 < i) {
                maxElement[i] = Math.max(maxElement[i - 1], nums[i]);
                i1++;
            }
        }
//Find minElement
        for(int j = 0;j<nums.length;j++){
            minElement[j] = nums[j];
            for(int l = j;l<nums.length;l++){
                minElement[j] = Math.min(nums[l],minElement[j]);
            }
        }
//Find Result
        for(int s = 0;s<nums.length;s++){
            result[s] = maxElement[s] - minElement[s];
        }
//finding k
        for(int t = 0;t<nums.length;t++){
            if(k >= result[t]){
                return t;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstStableIndex(new int[] {5,0,1,4},3));
    }
}
