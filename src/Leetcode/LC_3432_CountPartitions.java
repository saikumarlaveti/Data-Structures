package Leetcode;

import java.util.Arrays;

public class LC_3432_CountPartitions {
    public static int countPartitions(int[] nums) {
        int[] b = Arrays.copyOf(nums,nums.length);
       // copyArray(nums,b);
        System.out.println(Arrays.toString(b));
        //prefix sum
        for(int i = 1;i<nums.length;i++){
            b[i] += b[i-1];
        }

        //copyArray(nums,c);
        int[] c =  Arrays.copyOf(nums,nums.length);
        //suffix sum
        for(int  j = nums.length-2;j>=0;j--){
            c[j] = c[j] + c[j+1];
        }
        int sum = 0;
        int count = 0;
        for(int k = 0;k<nums.length-1;k++){
            sum = b[k] - c[k+1];
            if(sum % 2 == 0) {
                count ++;
            }
        }
        System.out.println(Arrays.toString(c));
       System.out.println(Arrays.toString(b));
        return count;
    }
//optional
    public static void copyArray(int[] arr,int[] brr){
        for(int i = 0;i<arr.length;i++){
            brr[i] = arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,10,3,7,6};
        System.out.println(countPartitions(arr));
    }
}
