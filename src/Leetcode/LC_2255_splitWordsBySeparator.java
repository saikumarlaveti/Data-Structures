package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_2255_splitWordsBySeparator {
    public static int countPrefixes(String[] words, String s) {
        int count  = 0;
        char c = s.charAt(0);
        for(String name :words){
           // for(int i = 0;i<words.length;i++)
          //  String name = words[i];
            if(s.startsWith(name)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //String[] words = {"a","b","c","ab","bc","abc"};
        String[] words = {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        String s = "w";
        System.out.println(countPrefixes(words,s));
    }
}

//https://leetcode.com/problems/count-prefixes-of-a-given-string/submissions/1688041864