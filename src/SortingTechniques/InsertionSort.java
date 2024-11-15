package SortingTechniques;

public class InsertionSort
{
    public void insertion(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr ){
                arr[prev+1] =  arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public void display(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {5,4,1,3,2};
        System.out.println("Before Sorting");
        is.display(arr);
        is.insertion(arr);
        System.out.println("After Sorting");
        is.display(arr);
    }
}
