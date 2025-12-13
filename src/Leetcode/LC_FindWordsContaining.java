package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_FindWordsContaining {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            int left = 0;
            int right = word.length()-1;
            while(left <= right){
                char lch = word.charAt(left);
                char rch = word.charAt(right);
                if(lch == x || rch == x){
                    list.add(i);
                    break;
                }
                left++;
                right--;
            }
        }
        return list;
    }

    public static List<Integer> findWordsContaining1(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                    list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char ch = 'e';
        List<Integer> result = findWordsContaining(words,ch);
        System.out.println(result);

        List<Integer> result1 = findWordsContaining1(words,ch);
        System.out.println(result1);
    }
}
