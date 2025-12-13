package Leetcode;

public class LC_1816_TruncateSentence {
    public static String truncateSentence(String s, int k) {

        String[] words = s.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i = 0;i<k;i++){
            result.append(words[i]+" ");
        }
        return result.toString().trim();
    }

    public static String truncateSentence1(String s,int k){
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
            if(count == k)
                return s.substring(0,i);
        }
        return null;
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
        System.out.println(truncateSentence1(s,k));
    }
}

