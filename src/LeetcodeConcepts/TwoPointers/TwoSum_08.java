package LeetcodeConcepts.TwoPointers;

import java.util.Arrays;

public class TwoSum_08 {
    public static int[] sum(int[] arr,int k){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum ==k){
                return new int[]{left,right};
            }
            else if(sum>k)
                right--;
            else
                left++;
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] arr = {1,24,5,6,3,2,8,2};
        int k = 11; //[3, 6]
        System.out.println(Arrays.toString(sum(arr,k)));
    }
}
