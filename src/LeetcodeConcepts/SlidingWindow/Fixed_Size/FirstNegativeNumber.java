package LeetcodeConcepts.SlidingWindow.Fixed_Size;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumber {
    public static int[] firstNegative(int[] arr, int k){
        int[] result = new int[arr.length-k+1];
        for(int i = 0;i<arr.length-k;i++){
            for(int j = i;j<k+i;j++){
                if(arr[j]<0){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }

    public static int[] firstNegativeSlidingWindowMethod(int[] arr, int k) {
        int[] result = new int[arr.length - k + 1];
        Queue<Integer> queue = new LinkedList<>();
        int left = 0;
        int resultIndex = 0;
        for (int right = 0; right < arr.length; right++) {
            // Add negative number entering the window
            if (arr[right] < 0) {
                queue.add(arr[right]);
            }
            // Window size becomes k
            if (right - left + 1 == k) {
                // Get first negative
                if (queue.isEmpty()) {
                    result[resultIndex] = 0;
                } else {
                    result[resultIndex] = queue.peek();
                }
                resultIndex++;
                // Remove the element leaving the window
                if (!queue.isEmpty() && arr[left] == queue.peek()) {
                    queue.poll();
                }
               left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    int[] result = firstNegative(new int[]{12, -1, -7, 8, -15, 30, 16, 28},3);
        System.out.println(Arrays.toString(result));
    }
}
