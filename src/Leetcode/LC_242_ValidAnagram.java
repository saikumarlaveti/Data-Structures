package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LC_242_ValidAnagram
{
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
                return false;
        char[] schars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tChars);
        for(int i = 0;i<s.length();i++){
            if(schars[i] != tChars[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
