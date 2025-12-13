package Leetcode;

import java.util.Arrays;
import java.util.List;

public class LC_2859_SumOfValues {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
      for(int i =0;i<nums.size();i++){
          int count = 0;
          int a = i;
          while (a>0){
              if((a&1)==1){
                  count++;
              }
               a = a>>1;
          }
          if(count == k){
              sum += nums.get(i);
          }
      }
      return sum;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,10,1,5,2);
        int k = 1;
        System.out.println( sumIndicesWithKSetBits(nums,k));
    }
}
