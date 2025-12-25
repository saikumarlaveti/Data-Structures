package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC_1089_DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length-1;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                for(int j = n;j>i;j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // best method
    public void duplicateZeros_01(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;

        for (int j = 0; j < n && i < n; j++) {
            if (nums[j] == 0) {
                res[i++] = 0;
                if (i < n) res[i++] = 0;
            } else {
                res[i++] = nums[j];
            }
        }

        for (int j = 0; j < n; j++) nums[j] = res[j];
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}
