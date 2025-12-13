package Leetcode;

public class LC_151_ReverseWords {
    public static String reverseWords(String s) {
        String[] words =s.trim().split("\\s+");
        int left = 0;
        int right = words.length-1;
        while(left<right){

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        StringBuilder result = new StringBuilder();
        for(String word:words){
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String name = "the sky is blue";
        System.out.println(reverseWords(name)); // blue is sky the
    }
}
