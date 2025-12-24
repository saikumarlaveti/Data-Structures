package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_506_RelativeRanks {
    public  static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        int []sorted = score.clone();
        Arrays.sort(sorted);

        Map<Integer,Integer> rankMap = new HashMap<>();
        int rank = 1;
        for(int i = n-1;i >= 0;i--){
            rankMap.put(sorted[i],rank++);
        }

        for(int i = 0;i<score.length;i++){
            int r = rankMap.get(score[i]);
            if(r == 1)
                result[i] = "Gold Medal";
            else if(r == 2)
                result[i] = "Silver Medal";
            else if(r == 3)
                result[i] = "Bronze Medal";
            else
                result[i] = String.valueOf(r);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }
}
