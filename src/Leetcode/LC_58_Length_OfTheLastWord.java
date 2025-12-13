package Leetcode;

import java.util.Arrays;

public class LC_58_Length_OfTheLastWord {
    public static int lengthOfLastWord(String s) {
         String [] arr = s.split(" ");
         String length = arr[arr.length-1];
        return length.length();
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));  // 5
    }
}
