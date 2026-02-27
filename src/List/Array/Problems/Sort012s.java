package List.Array.Problems;

import java.util.Arrays;

public class Sort012s {
    public static void sortMethod_1(int[] arr){
        Arrays.sort(arr);
    }

    public static void sortMethod_2(int[] arr){
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
         for(int i:arr){
             if(i ==0)
                 c0++;
             else if (i==1) {
                 c1++;
             }
             else {
                 c2++;
             }
         }
        System.out.println(c0+" " + c1 + " "+ c2);
        int count =0;
         for(int i = 0;i<c0;i++){
             arr[count++] = 0;
         }
         for(int j = 0; j <c1; j++){
             arr[count++] = 1;
         }
        for(int k = 0; k <c2; k++){
            arr[count++] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,2,1,0,2,1};
        sortMethod_2(arr);
    }
}
