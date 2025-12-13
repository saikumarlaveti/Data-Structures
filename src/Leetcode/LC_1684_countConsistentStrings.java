package Leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LC_1684_countConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(int j = 0;j<words.length;j++){
            String word = words[j];
            int left = 0;
            int right = word.length()-1;
            while(left<=right){
                if(!set.contains(word.charAt(left)) || !set.contains(word.charAt(right))){
                    count--;
                    break;
                }
                left++;
                right--;
            }
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
}
