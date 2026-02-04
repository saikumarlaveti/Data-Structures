package LeetcodeConcepts.TwoPointers;

import java.util.Arrays;

public class ReverseAString_02 {
    public static String reverse(String word){
        if(word.length()==1)
            return word;

        int left = 0;
        int right = word.length()-1;
        char[] ch = word.toCharArray();
        while(left<right){
            char tempChar = word.charAt(left);
            ch[left] = ch[right];
            ch[right] = tempChar;
            left++;
            right--;
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String name = "saikumar";
        System.out.println(reverse(name)); //ramukias

    }
}
