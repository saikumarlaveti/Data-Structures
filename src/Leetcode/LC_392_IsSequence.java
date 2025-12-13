package Leetcode;

public class LC_392_IsSequence {
    public static boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        int m = s.length(),n = t.length();
        while (i < m && j < n) {
            if(s.charAt(i) ==  t.charAt(j)){
                i++;
                j++;
            }
            else
                j++;
        }
       return i == m;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t)); // true

        String s1  = "saikumar";
        String s2 = "kasisl";
        System.out.println(isSubsequence(s1,s2)); // false
    }
}
