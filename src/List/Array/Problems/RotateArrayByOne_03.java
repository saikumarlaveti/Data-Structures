package List.Array.Problems;

import java.util.Arrays;

public class RotateArrayByOne_03 {
    //Method - 1
    public static void rotate_1(int[] arr){
        int  n = arr.length;
        int temp = arr[arr.length-1];
        for(int i = n-2;i>=0;i--){
            arr[n-1]=arr[i];
            n--;
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }


    //Method - 2 (using temp array)
    public static void rotate_2(int[] arr){
        int n = arr.length;
        int[] temp = new int[arr.length];
        int index = 1;
        for(int i = 0;i<=n-2;i++){
            temp[index++] = arr[i];
        }
        temp[0] = arr[n-1];
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate_1(arr);
        rotate_2(arr);
    }
}
