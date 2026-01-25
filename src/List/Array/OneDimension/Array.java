package List.Array.OneDimension;

public class Array {

    public static void creation_01(){
        //creation of array -method 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // Creation of array - method 2
        int[] brr = {4,5,6,7,8,9};//creation and insertion at a time
        for(int i = 0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
    }


    public static boolean findElement(int[] arr,int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        creation_01();
        int[] nums = {4,5,6,7,8,9};
        System.out.println(findElement(nums,5));  // true because element is found in the array
        System.out.println(findElement(nums,100)); // false because element is not found in the array



    }
}
