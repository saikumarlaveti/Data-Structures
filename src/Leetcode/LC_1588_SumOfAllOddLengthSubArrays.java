package Leetcode;

public class LC_1588_SumOfAllOddLengthSubArrays {
    public int sumOddLengthSubarrays(int[] arr) {

        int n = arr.length;

        int[] prefix = new int[n + 1];

        // Build prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int sum = 0;

        // Choose starting index
        for (int i = 0; i < n; i++) {

            // Choose ending index
            for (int j = i; j < n; j++) {

                int length = j - i + 1;

                // Only odd-length subarrays
                if (length % 2 == 1) {

                    sum += prefix[j + 1] - prefix[i];
                }
            }
        }

        return sum;
    }
}
