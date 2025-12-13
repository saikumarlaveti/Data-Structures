package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_1431_KidsWithTheGreatest {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = candies[0];
        for(int i = 0;i<candies.length;i++){
            if(maximum<candies[i])
                maximum = candies[i];
        }

        List<Boolean> result = new ArrayList<>();
        for(int j = 0;j<candies.length;j++){
            if(candies[j] + extraCandies >= maximum)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies)); //  [true, true, true, false, true]
    }
}
