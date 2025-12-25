package Strings;

public class Swapping {
    public static void swap(String word1,String word2)
    {
        System.out.println("Before Swapping");
        System.out.println(word1 +" "+word2);
        System.out.println("After Swapping");
        word1 = word1+word2;
        word2 = word1.substring(0,word1.length()-word2.length());
        word1 = word1.substring(word2.length());
        System.out.println(word1 +" "+word2);
    }

    public static void main(String[] args) {
        String word1 = "Sai";
        String word2 = "Kumar";
        Swapping.swap(word1,word2);
    }

}
