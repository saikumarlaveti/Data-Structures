package Leetcode;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LC_977_Square_Of_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i]  *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        LC_977_Square_Of_Sorted_Array ss = new LC_977_Square_Of_Sorted_Array();
        int [] re = Arrays.stream(nums).map(i->i*i).sorted().toArray();
        Consumer<int[]> print = i-> System.out.println(Arrays.toString(i));
        print.accept(re);
        int[] result = ss.sortedSquares(nums);
       System.out.println(Arrays.toString(result));
    }
}
