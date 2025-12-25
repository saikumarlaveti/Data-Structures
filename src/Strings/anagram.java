package Strings;

import java.util.Arrays;

public class anagram {

    public void anagramOrNot(String word1,String word2)
    {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.length() != word2.length()){
            System.out.println("String are not a anagram");
        }
        else
        {
        char[] word3 = word1.toCharArray();
        char[] word4 =  word2.toCharArray();
        Arrays.sort(word3);
        Arrays.sort(word4);
        if(Arrays.equals(word3,word4)){
            System.out.println("Strings are anagram Strings");
        }
        else {
            System.out.println("Strings are not anagram Strings");
        }
        }
    }

    public static void main(String[] args) {
        String word1 = "abcD";
        String word2 = "baDc";
        anagram an = new anagram();
        an.anagramOrNot(word1,word2);
    }
}
