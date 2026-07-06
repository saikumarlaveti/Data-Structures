package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC_575_DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> nums = new HashSet<>();
        for(int i:candyType){
            nums.add(i);
        }
    return Math.min(candyType.length/2, nums.size());
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(distributeCandies(arr));
    }
}
