package List.Array.Problems;

public class GFG_09_FindMissingElement {

    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1; // because one number is missing

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        System.out.println(findMissingElement(arr)); // Output: 2
    }
}