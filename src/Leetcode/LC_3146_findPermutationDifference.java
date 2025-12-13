package Leetcode;

import java.util.HashSet;

public class LC_3146_findPermutationDifference {
    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j = 0;j<t.length();j++){
                if(ch == t.charAt(j))
                    sum += Math.abs(i - j);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc","bac"));

    }
}
