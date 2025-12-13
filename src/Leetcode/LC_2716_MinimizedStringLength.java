package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC_2716_MinimizedStringLength {
    public static int minimizedStringLength(String s) {
        Set<Character> list = new HashSet<>();
        for(int i =0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        return list.size();
    }
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aabc")); //3
    }
}
