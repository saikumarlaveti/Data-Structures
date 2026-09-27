package LeetcodeConcepts.SlidingWindow.Fixed_Size;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumSubArray_04 {
    public static int[] maxOfSubarrays(int[] arr, int k){
        int[] result = new int[arr.length-k+1];
        int resultIndex = 0;
        int max = 0;
        for(int i = 0;i<=arr.length-k;i++){
            max = arr[i];
            for(int j = i;j<k+i;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            result[resultIndex] = max;
            resultIndex++;
        }
        return result;
    }

    public static int[] maxOfSubarray_SlidingWindow(int[] arr, int k) {

        int[] result = new int[arr.length - k + 1];
        int resultIndex = 0;
        int left = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < arr.length; right++) {

            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[right]) {
                deque.pollLast();
            }

            // Add current index
            deque.addLast(right);

            // Remove indexes outside the window
            while (!deque.isEmpty() && deque.peekFirst() < left) {
                deque.pollFirst();
            }

            // Window size = k
            if (right - left + 1 == k) {

                // Front contains maximum
                result[resultIndex] = arr[deque.peekFirst()];
                resultIndex++;

                // Slide window
                left++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxOfSubarrays(new int[]{1, 3, -1, -3, 5, 3, 6, 7},3)));
        System.out.println(Arrays.toString(maxOfSubarray_SlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7},3)));
    }
}
