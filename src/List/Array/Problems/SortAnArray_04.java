package List.Array.Problems;

import java.util.Arrays;

public class SortAnArray_04 {
    //Method -1 (Using third Variable)
    public static void sortAnArray_01(int[] arr){
        for(int i = 0;i<=arr.length-2;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Method -2 (Built in Function)
    public static void sortAnArray_02(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Method -3 (without using third variable)
    public static void sortAnArray_03(int[] arr){
        for(int i = 0;i<=arr.length-2;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                  arr[i] = arr[i] + arr[j];
                  arr[j] = arr[i] - arr[j];
                  arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
    int[] arr ={1,4,2,5,3};
    sortAnArray_01(arr);
    sortAnArray_02(new int[]{99,1,5,2,77});
    sortAnArray_03(new int[]{99,4,999,2,0});//New method Passing Array
    }
}
