package List.Array.SimpleArray;

public class Array {
    public static void main(String[] args) {
        //creation of array -method 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // Creation of array - method 2
       int[] brr = {4,5,6}; //creation and insertion at a time
        for(int i = 0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }


    }
}
