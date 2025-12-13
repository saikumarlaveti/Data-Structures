package Leetcode;

public class LC_1768_MergeStringAlternatively {

    public static String mergeAlternately(String word1, String word2) {
        int L1 = word1.length()-1;
        int L2 = word2.length()-1;
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();
        while(i<=L1 || j<=L2){
            if(i<=L1 && j<=L2){
                result.append(word1.charAt(i));
                result.append(word2.charAt(j));
                i++;j++;
            }
            else if(i>L1 &&j<=L2){
                result.append(word2.charAt(j));
                j++;
            }
            else {
                result.append(word1.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));    // apbqcr
        System.out.println(mergeAlternately("sai","kumar"));   // skauimar
    }
}
