package SortingTechniques;

public class SelectionSort {
    public void selection(int[] arr){
        for(int i =0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public void display(int[] arr){
        for(int a :arr){
            System.out.print(a+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int [] arr = {5,2,3,4,1};
        System.out.println("Before sorting");
        ss.display(arr);
        ss.selection(arr);
        System.out.println("after sorting");
        ss.display(arr);


    }
}
