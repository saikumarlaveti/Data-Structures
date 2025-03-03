package SortingTechniques;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

class BubbleSort{
    public void bubbleSort(int[] arr ,int n){
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
            boolean swap = false;
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false)
                    break;
        }
    }

    public void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 8,5,6,3,2,1};
        int n = arr.length;
        BubbleSort bs  = new BubbleSort();
        bs.print(arr);
        bs.bubbleSort(arr,n);
        bs.print(arr);






//        Consumer<int[]> ref = (a) -> System.out.print(Arrays.toString(a));
//        ref.accept(arr);
//        Supplier<BubbleSort> ref1 = ()->new BubbleSort();
//        BubbleSort bs = ref1.get();
//        bs.bubbleSort(arr,n-1);
//        System.out.println();
//        ref.accept(arr);
    }
}