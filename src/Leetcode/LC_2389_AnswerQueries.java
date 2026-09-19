package Leetcode;

import java.util.Arrays;

public class LC_2389_AnswerQueries {
    public static int[] answerQueries(int[] nums, int[] queries) {
        //Taking Result array
        int[] result = new int[queries.length];
        Arrays.sort(nums);

        //Calculating Prefix Sum
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int j = 0;j<queries.length;j++){
            int left = 0;
            int right = prefix.length-1;
            while(left<right){
                if(prefix[left]<=queries[j]){
                    left++;
                }
                 if(prefix[right] >= queries[j]){
                    right--;
                }
            }
            //result[j] = left>=prefix.length-1?left+1:left;
            //      result[j] = left;

            result[j] = left==0?0: left >right?left+right-1:left+1;
        }
        return result;
    }

//All Test Case passed code
    public int[] answerQueries_01(int[] nums, int[] queries) {

        int[] result = new int[queries.length];

        // 1. Sort nums
        Arrays.sort(nums);

        // 2. Create prefix sum
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // 3. Process every query
        for (int j = 0; j < queries.length; j++) {

            int query = queries[j];

            int left = 0;
            int right = prefix.length - 1;

            // Binary search for the last prefix sum <= query
            int answer = 0;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (prefix[mid] <= query) {

                    // This many elements can fit
                    answer = mid + 1;

                    // Try to take more elements
                    left = mid + 1;

                } else {

                    // Sum is too large, take fewer elements
                    right = mid - 1;
                }
            }

            result[j] = answer;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(new int[]{2,3,4,5},new int[]{1})));
        System.out.println(Arrays.toString(answerQueries(new int[]{4,5,2,1},new int[]{3,10,21})));
    }
}
