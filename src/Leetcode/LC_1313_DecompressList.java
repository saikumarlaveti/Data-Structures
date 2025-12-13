package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LC_1313_DecompressList {
    public static int[] decompressRLElist(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i+=2){
            int freq = (nums[i]);
            int val = (nums[i+1]);
            int j = 0;
            while(j<freq){
                result.add(val);
                j++;
            }
        }
        int[] arr = new int[result.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(arr))); //  [2, 4, 4, 4]

    }
}
