package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_2828_IsAcronym {
    public  static boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length())
            return false;

        int k = 0;
        for(int i = 0;i<words.size();i++){
            String name = words.get(i);
            if(name.charAt(0) == s.charAt(k))
                k++;

            else
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        List<String> words =  new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";
        System.out.println(isAcronym(words,s)); // true
    }
}
//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/?envType=problem-list-v2&envId=string



