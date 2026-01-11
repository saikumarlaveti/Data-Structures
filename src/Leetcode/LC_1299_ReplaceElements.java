package Leetcode;

import java.util.Arrays;

public class LC_1299_ReplaceElements {
    public static int[] replaceElements(int[] arr){

        for(int  i = 0;i<=arr.length-1;i++){
            boolean flag = false;
            if(i<arr.length-1) {
                int max = arr[i + 1];
                for (int j = i + 1; j < arr.length; j++) {
                    if (max <= arr[j]) {
                        max = arr[j];
                        flag = true;
                    }
                }


                if (flag)
                    arr[i] = max;
                else
                    arr[i] = -1;
            }
            else
                arr[i] = -1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

        System.out.println("Original Array : " + Arrays.toString(arr));
       int[] result = replaceElements(arr);
        System.out.println("After change " + Arrays.toString(result));

    }
}
