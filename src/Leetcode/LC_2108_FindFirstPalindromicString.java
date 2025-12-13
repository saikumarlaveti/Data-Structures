package Leetcode;

public class LC_2108_FindFirstPalindromicString {
    public static String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        boolean  value = false;
        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                value = true;
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}
