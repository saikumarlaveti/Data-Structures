package LeetcodeConcepts.TwoPointers;

public class MergeStringAlternately_16 {
    public static String mergeStrings(String word1,String word2){
        int index1 = 0;
        int index2 = 0;
        int l1  = word1.length();
        int l2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while(index1 < l1 || index2 < l2){
            if(index1 < l1 && index2 < l2){
                sb.append(word1.charAt(index1));
                sb.append(word2.charAt(index2));
                index1++;
                index2++;
            } else if (index1 < l1) {
                sb.append(word1.charAt(index1));
                index1++;
            }
            else{
                sb.append(word2.charAt(index2));
                index2++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "x";
        System.out.println(mergeStrings(word1,word2));
    }
}
