package Leetcode;

import java.util.Arrays;
import java.util.List;

public class LC_2824_CountPairs {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0;i<nums.size();i++){
            for(int j = i+1;j<nums.size();j++){
                int sum = nums.get(i) + nums.get(j);
                if(target > sum)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Integer[] arr = {-1,1,2,3,1};
        System.out.println(countPairs(Arrays.asList(arr),2));  //3
    }
}
