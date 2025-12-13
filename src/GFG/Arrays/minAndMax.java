package GFG.Arrays;

import java.util.Arrays;

public class minAndMax {
    public void Method_1(int[] arr){
        int min = arr[0] ;
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(min>=arr[i])
                min = arr[i];
            else
                max = arr[i];
        }
        System.out.println("Minimum Element : "+ min + " \nMaximum Element : " + max);
    }

    public void Method_2(int[] arr){
        Arrays.sort(arr);
        System.out.println("Minimum Element : "+ arr[0] + " \nMaximum Element : " + arr[arr.length-1]);
    }

    public void Method_3(int[] arr){
        int min = Arrays.stream(arr).min().orElseThrow();
        int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println("Minimum Element : "+ min + " \nMaximum Element : " + max);
    }
    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 1, 9};
        minAndMax mm  = new minAndMax();
        mm.Method_1(arr);
        mm.Method_2(arr);
        mm.Method_3(arr);
    }
}
