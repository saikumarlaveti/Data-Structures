package List.Array;

public class DoubleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr =  new int[arr.length*2];
        int temp = 0;
        for(int i =0;i<brr.length;i++){
            brr[i] = arr[temp];
             temp = (temp+1)%arr.length;


        }
        for (int k:brr){
            System.out.print(k + " ");
        }
    }
}
