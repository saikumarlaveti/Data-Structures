package LeetcodeConcepts.Recursion;

import java.util.Arrays;
import java.util.function.Consumer;

public class SelectionSort {

    public void sort(int[] arr,int i) {
        if (i >= arr.length - 1) {
            return;
        }
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
        sort(arr, i + 1);

    }
    public void print(int[] arr){
        Consumer<int[]> task = (a) -> System.out.print(Arrays.toString(a));
        task.accept(arr);
    }

    public void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        SelectionSort ss = new SelectionSort();
        ss.display(arr);
        ss.sort(arr,0);
        ss.print(arr);

    }
}
