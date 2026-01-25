package List.Array.Problems;

import java.util.Arrays;

public class ReverseArray_02 {
    //Method - 1
    public static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    //method -2
    public static int[] reverse_02(int[] arr){
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i = arr.length-1;i>=0;i--){
            temp[index++] = arr[i];
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse(arr)));
        int[] brr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverse_02(brr)));
    }
}
