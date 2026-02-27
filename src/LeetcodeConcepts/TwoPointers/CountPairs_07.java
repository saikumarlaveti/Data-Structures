package LeetcodeConcepts.TwoPointers;

public class CountPairs_07 {
    public static int countpair(int[] arr,int target){
        int left  = 0;
        int right = arr.length-1;
        int count = 0;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                count++;
                left++;
                right--;
            }
            else if(sum > target){
                right--;
            }
            else
                left++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        System.out.println(countpair(arr,8)); // 3
    }
}
