package Leetcode;

public class LC_2057_SmallestIndexWithEqualValue {
    public int smallestEqual(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        LC_2057_SmallestIndexWithEqualValue sim = new LC_2057_SmallestIndexWithEqualValue();
        System.out.println(sim.smallestEqual(arr));
        int[]b ={4,3,2,1};
        System.out.println(sim.smallestEqual(b));
    }
}
