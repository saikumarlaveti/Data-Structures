package Recursion;

public class BubbleSort {
    public void bubbleSort(int[] arr,int n){
        if(n == 1)
            return ;
        boolean swap = false;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = true;
            }
        }
        if(swap == false )
            return;
        bubbleSort(arr,n-1);
    }

    public void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 8,5,6,3,2,1};
        BubbleSort bs = new BubbleSort();
        int n = arr.length;
        bs.print(arr);
        bs.bubbleSort(arr,n);
        bs.print(arr);
    }
}
