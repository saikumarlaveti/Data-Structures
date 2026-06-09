package DSA_Sheet_TopicWise_Problems.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray_02 {

    //using two pointers
    public static void reverseArray_Method_01(int[] arr){
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray_Method_02(int[] arr){
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray_Method_01(arr);
    }

}
