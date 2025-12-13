package LeetcodeConcepts.TwoPointers;

public class TwoSumSorted {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right}; // Return indices
            } else if (sum < target) {
                left++;  // Move left pointer right to increase sum
            } else {
                right--; // Move right pointer left to decrease sum
            }
        }

        return new int[]{-1, -1}; // No solution found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 8, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
