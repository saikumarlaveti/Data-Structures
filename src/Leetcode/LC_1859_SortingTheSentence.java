package Leetcode;

import java.util.Arrays;

public class LC_1859_SortingTheSentence {
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String[] result = new String[arr.length];

        for(int i = 0 ;i<arr.length;i++){
            String word = arr[i];
            System.out.println("word length " + word.length());
            //System.out.println(word);
            //System.out.println(word.charAt(word.length()-1));
            int right = Integer.parseInt(String.valueOf(word.charAt(word.length()-1)));
            System.out.println(right);
        //    result[--right] = s.substring(0,word.length()-2);
            result[--right] = word.substring(0,word.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String t:result){
            sb.append(t);
            sb.append(" ");
        }
        System.out.println(Arrays.toString(result));
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));  // This is a sentence
    }
}


