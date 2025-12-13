package Leetcode;

import java.util.Arrays;
import java.util.function.Consumer;

public class LC_283_MoveZeros {

        public void moveZeroes(int[] nums) {
            int nonZero = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] != 0){
                    nums[nonZero++] = nums[i];
                }
            }
            while(nonZero<nums.length){
                nums[nonZero++] = 0;
            }
        }

    public static void main(String[] args) {
        LC_283_MoveZeros mz = new LC_283_MoveZeros();
        Consumer<int[]> print = i->System.out.print(Arrays.toString(i)+ " ");
        int[] arr = {0,1,0,3,12};
        print.accept(arr);
        mz.moveZeroes(arr);
        print.accept(arr);

    }
    }

