package SortingTechniques;

import java.util.Arrays;
import java.util.function.Consumer;

class SelecionSort{
    public void sorting(int[] arr){
        int n = arr.length ;
        int temp = 0;
        for(int i = 0 ;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j])
                    temp = j;
            }
            int min = arr[i];
            arr[i] = arr[temp];
            arr[temp] = min;
        }
    }

    public void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //java 8 feature
    public void print(int[] arr){
        Consumer<int[]> task = (a) -> System.out.println(Arrays.toString(arr));
        task.accept(arr);
    }

    public static void main(String[] args) {
        int [] arr = {5, 1, 12, -5, 16, 2, 12, 14};
       SelecionSort ss = new SelecionSort();
       ss.print(arr);
       ss.sorting(arr);
       ss.print(arr);

    }
}