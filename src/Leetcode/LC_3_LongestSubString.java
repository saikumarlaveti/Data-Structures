package Leetcode;

import java.util.HashSet;

public class LC_3_LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;int right = 0;int maximum = 0;
        HashSet<Character> set = new HashSet<>();

        while(right<s.length()){
            System.out.println(set);
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maximum = Math.max(maximum,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                System.out.println("after remove : " + set);
                left++;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcb"));  //3  -->abc
        System.out.println(lengthOfLongestSubstring("abcabcdab"));  //4 -->abcd
    }
}
