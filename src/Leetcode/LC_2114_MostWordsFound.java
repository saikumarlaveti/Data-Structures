package Leetcode;

public class LC_2114_MostWordsFound {
    public  static int mostWordsFound(String[] sentences) {
        int space = 0;
        int count = 0;
        for(int i = 0;i<sentences.length;i++){
            String name = sentences[i];
            count = 0;
            for(int j = 0;j<name.length();j++){
                if(name.charAt(j) ==' '){
                    count++;
                }

            }
            space = Math.max(space,count);
        }
        return space+1;
    }

    //method - 2
    public int mostWordsFound1(String[] sentences) {

        int maxWord=0;
        for(String word:sentences)
        {
            String[] words=word.split(" ");
            if(words.length>maxWord)
            {
                maxWord=words.length;
            }
        }
        return maxWord;
    }
    public static void main(String[] args) {
        String[] names = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(names));

    }
}
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/1687479496
