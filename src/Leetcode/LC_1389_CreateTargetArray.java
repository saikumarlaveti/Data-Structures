package Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_1389_CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            int in = index[i];

            // Shift elements to the right to make space
            for (int j = size; j > in; j--) {
                target[j] = target[j - 1];
            }

            target[in] = nums[i];
            size++;
        }

        return target;
    }

    public static int[] createTargetArray1(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            list.add(index[i], nums[i]);
        }
        for(int i = 0;i<nums.length;i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));  //[0,4,1,3,2]
        System.out.println(Arrays.toString(createTargetArray1(nums,index)));  //[0,4,1,3,2]

    }
}
