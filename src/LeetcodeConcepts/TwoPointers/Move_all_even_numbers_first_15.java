package LeetcodeConcepts.TwoPointers;

import java.util.Arrays;

public class Move_all_even_numbers_first_15 {
    public static void moveEven(int[]arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]%2==0 && arr[right]%2==0){
                left++;
            } else if (arr[left]%2==1 && arr[right]%2==0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                }
            else if(arr[left]%2==0 && arr[right]%2==1)
                left++;
            else if (arr[left]%2==1 && arr[right]%2==1)
                right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        moveEven(arr);
    }
}
