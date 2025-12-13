package Leetcode;

import java.util.HashMap;

public class LC_1832_checkIfPangram {
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;

        HashMap<Character,Integer> alphabets = new HashMap<Character,Integer>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabets.put(ch, 0);
        }

        for(int i = 0;i<sentence.length();i++){
            char c = sentence.charAt(i);
            if (alphabets.containsKey(c)) {
                alphabets.put(c, alphabets.get(c) + 1);
            }
            else{
                alphabets.put(c,0);
            }
        }

        for(Integer i : alphabets.values()){
            if(i == 0)
                return false;
        }

        return true;
    }

    public static boolean checkIfPangram1(String sentence) {
        for(char c = 'a' ;c<='z';c++){
            if(!sentence.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(word));
        System.out.println(checkIfPangram1(word));
    }
}
