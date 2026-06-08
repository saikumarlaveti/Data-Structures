package DSA_Sheet_TopicWise_Problems.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinAndMaxElement_01 {

    //Method - 1
    public static int[] minAndMaxElement_01(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }

    //Method - 2
    public static int[] minAndMaxElement_02(int[] arr){
        int small = arr[0];
        int large = 0;
        for (int j : arr) {
            if (j < small) {
                small = j;
            }
            if (j > large) {
                large = j;
            }
        }
        return new int[]{small,large};
    }

    //Method - 3
    public static void minAndMaxElement_03(int[] arr){
        OptionalInt min = Arrays.stream(arr).min();
        OptionalInt max = Arrays.stream(arr).max();

        System.out.println("Min: " + min.getAsInt());
        System.out.println("Max: " + max.getAsInt());
    }
    public static void main(String[] args) {
        //method 1 using inbuilt function
        int[] arr = {1,2,4,3,0};
        int[] result = minAndMaxElement_01(arr);
        System.out.println(Arrays.toString(result));

        //method 2 using for loop
        int[] b = {5,6,7,4,5,6};
        int[] result1 = minAndMaxElement_02(b);
        System.out.println(Arrays.toString(result1));

        //method 3 using java 8
        int[] c = {3,4,9,5,2};
        minAndMaxElement_03(c);

        for(int i = 1;i<=59;i++){
            System.out.println("JavaScript :" + i);
        }
    }
}
