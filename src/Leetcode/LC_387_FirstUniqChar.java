package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LC_387_FirstUniqChar {
    public static int firstUniqChar(String s) {
        int k = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i)  != s.charAt(j)){
                    return i;
                }
            }
    

        } return -1;
    }
    public static void main(String[] args) {
        String name = "loveleetcode";
        System.out.println(firstUniqChar(name));
    }
}
