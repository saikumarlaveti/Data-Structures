package List.Array.Problems;

import java.util.Arrays;

public class GFG_06_MoveNegativeNumber {
    public static void sortMethod_1(int[] arr){
        Arrays.sort(arr);
    }

    public static void sortMethod_2(int[] arr){
        int index = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] < 0){
                int temp = arr[index];
                arr[index++] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //two poiners
    public static void sortMethod_3(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while (left<right){

            while(left<right && arr[left] < 0){
                left++;
            }
            while(right>left && arr[right] > 0){
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2,4,-3,9,-10,12,-5,-2};
        sortMethod_3(arr);
    }
}
