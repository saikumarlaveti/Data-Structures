package LeetcodeConcepts.SlidingWindow.Fixed_Size;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageOfAll_Subarrays_02 {
    public  static double[] findAverages(int[] arr, int k){
        int sum = 0;
        ArrayList<Double> nums = new ArrayList<Double>();
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        nums.add((double)sum/k);
        for(int j = k;j<arr.length;j++){
            sum = sum - arr[j-k]+arr[j];
            nums.add((double)sum/k);
        }
        System.out.println(nums);
        double[] result = new double[nums.size()];
        for(int l = 0; l <result.length; l++){
            result[l] = nums.get(l);
        }
        return   result;
    }

//better approach
    // no need to convert arraylist to array (type double)
    //that is the difference above and below problems
    public static double[] findAverages_01(int[] arr, int k) {

        double[] result = new double[arr.length - k + 1];

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        result[0] = (double) sum / k;

        // Slide the window
        for (int j = k; j < arr.length; j++) {

            sum = sum - arr[j - k] + arr[j];

            result[j - k + 1] = (double) sum / k;
        }

        return result;
    }
    public static void main(String[] args) {
       double[] result  = findAverages(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2},5);
        System.out.println(Arrays.toString(result));
    }
}
