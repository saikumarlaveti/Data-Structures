package LeetcodeConcepts.TwoPointers;

import java.util.Arrays;

public class MoveNegativeNumbers_06 {
    public static int[] move(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){

            if(arr[left]<0 &&arr[right]>0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left]>0) {
                left++;
            }
            else
                right--;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,9,7,-1,-9,5,-3}; //[3, 5, 9, 7, -1, -9, -2, -3]
        System.out.println(Arrays.toString(move(arr)));
    }
}
