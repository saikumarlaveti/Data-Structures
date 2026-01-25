package List.Array.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxElements_01 {

    //Method : 1
    public static ArrayList<Integer> minMaxElements(int[] arr){
        int min = arr[0];
        int max = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
        }
        list.add(min);
        list.add(max);
        return list;
    }

    //Method : 2
    public static int[] minMaxElements_01(int[] arr){
      Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
    public static void main(String[] args) {
        int[] arr = {32011,123,1045,1205,254,28763,6537,3161};
        System.out.println(minMaxElements(arr));
        System.out.println(Arrays.toString(minMaxElements_01(arr)));
    }
}
