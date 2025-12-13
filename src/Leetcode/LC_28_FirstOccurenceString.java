package Leetcode;

class LC_28_FirstOccurenceString{
    public static int strStr(String haystack, String needle) {
    int L = needle.length();
    for(int i = 0; i<=haystack.length()- L ; i++){
        String k = haystack.substring(i, i+L);
        if(k.equals(needle)){
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
       String haystack = "sadbutsad";
       String needle = "sad";
        System.out.println(strStr(haystack,needle));
        System.out.println(strStr("leetcode","leeto"));
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("a","a"));
    }
}

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1697818884