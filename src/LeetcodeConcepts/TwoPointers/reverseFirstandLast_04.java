package LeetcodeConcepts.TwoPointers;

import java.util.Arrays;

public class reverseFirstandLast_04 {
    public static int[] swipt(int[] arr){
        if(arr.length==1)
            return arr;

        else {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(swipt(arr)));
    }
}
