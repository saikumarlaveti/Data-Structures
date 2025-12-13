package Arrays;

public class ReverseArray {
    public void reverseMethod_1(int[] arr){
        int[] temp = new int[arr.length];
        int n  = arr.length;
        for(int i = 0;i<arr.length;i++){
            temp[i] = arr[n-i-1];
        }
        for(int j = 0; j <arr.length; j++){
            arr[j] = temp[j];
        }
        System.out.println("After Change : ");
        printArray(arr);
    }

    public void reverseMethod_2(int[] arr){
        int lower = 0;
        int upper = arr.length-1;
        int temp;
        while(lower<=upper){
            temp = arr[lower];
            arr[lower] = arr[upper];
            arr[upper] = temp;
            lower++;
            upper--;
        }
        printArray(arr);
    }

    public void reverseMethod_3(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        printArray(arr);
    }

    public void reverseMethod_4(int[] arr,int left,int right){
        if(left>right){
            return;
        }
        else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
             reverseMethod_4(arr, ++left,--right);
        }

    }
    public void printArray(int[] arr){
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseArray rs = new ReverseArray();
        System.out.println("-------------------Method -1 -------------------------------");
        int[] arr = {3, 5, 4, 1, 9};
        System.out.println("Original Array : ");
        rs.printArray(arr);
        rs.reverseMethod_1(arr);

        System.out.println("-------------------Method - 2 -------------------------------");
        System.out.println("Original Array : ");
        rs.printArray(arr);

        rs.reverseMethod_2(arr);
        System.out.println("-------------------Method - 3 -------------------------------");
        System.out.println("Original Array : ");
        rs.printArray(arr);
        rs.reverseMethod_3(arr);

        System.out.println("-------------------Method - 4 -------------------------------");
        System.out.println("Original Array : ");
        rs.printArray(arr);
        int left = 0,right = arr.length-1;
        rs.reverseMethod_4(arr,left,right);
       rs.printArray(arr);

    }
}
