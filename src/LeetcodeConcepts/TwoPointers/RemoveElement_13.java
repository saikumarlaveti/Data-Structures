package LeetcodeConcepts.TwoPointers;

public class RemoveElement_13 {
    private static int removeElement(int[] arr, int remove) {
        int start = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != remove){
                arr[start++] = arr[i];
            }
        }
        return start-1;
    }
    public static void main(String[] args) {
        int[] arr={3,2,2,3,1,7,8,4};
        int remove = 3;
        int index = removeElement(arr,remove);
        for(int  i = 0;i<=index;i++){
            System.out.print(arr[i] + " ");
        }
    }


}
