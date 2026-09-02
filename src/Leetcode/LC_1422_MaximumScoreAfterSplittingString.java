package Leetcode;

import java.util.Arrays;

public class LC_1422_MaximumScoreAfterSplittingString {
    public static int maxScore(String s) {
        int[] prefix = new int[s.length()];
        prefix[0] = s.charAt(0) - '0';
        for(int  i =1;i<s.length();i++){
            prefix[i] = s.charAt(i) - '0' + prefix[i-1];
        }
        int zero = 0;
        int one = 0;
        int sum = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)-'0' == 0){
                zero++;
            }
            else{
                one++;
            }
            sum = Math.max(zero + prefix[prefix.length-1] - one,sum);
        }
    return sum;
    }
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
}
