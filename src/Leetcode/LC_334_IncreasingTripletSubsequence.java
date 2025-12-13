package Leetcode;

public class LC_334_IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i :nums){
            if(i<=first){
                first = i;
            }
            else if(i<=second){
                second = i;
            }
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr)); //true
    }
}
