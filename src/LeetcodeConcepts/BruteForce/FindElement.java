package LeetcodeConcepts.BruteForce;

public class FindElement {
   public static int bruteForceSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 3;
        System.out.println(bruteForceSearch(arr,target));
    }
}
