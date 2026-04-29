package List.Array.Problems;

import java.util.Arrays;

public class GFG_11_arrayInWaveForm {

    public static int[] waveForm(int[] arr){

        for(int i = 0;i<arr.length-2;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(waveForm(arr)));
    }
}
