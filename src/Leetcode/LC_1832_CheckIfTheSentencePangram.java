package Leetcode;

import java.util.HashSet;

public class LC_1832_CheckIfTheSentencePangram {
    public static boolean checkIfPangram(String[] word) {
        HashSet<String> set = new HashSet<>();
        for(int i =0;i<word.length;i++){
            set.add(word[i]);
        }
        System.out.println(set);

        return false;
    }

    public static void main(String[] args) {
        String[] sentence ={"bella","label","roller"};
        checkIfPangram(sentence);
        String sai  = "saikumar";

    }
}
