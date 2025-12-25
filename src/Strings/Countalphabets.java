package Strings;

public class Countalphabets {

    public void countVowelsAndConsonant(String word)
    {
        int vCount = 0;
        int cCount = 0;
        word = word.toLowerCase();
        for(int i  =0;i<word.length();i++)
        {
            if( word.charAt(i) == 'a' ||word.charAt(i) == 'e' ||word.charAt(i) == 'i' ||word.charAt(i) == 'o' ||word.charAt(i) == 'u' )
            {
                vCount++;
            }
            else
                cCount++;
        }
        System.out.println(word);
        System.out.println("Vowel Count- "+ vCount);
        System.out.println("ConsonantCount- "+cCount);
    }

    public static void main(String[] args)
    {
        String word = "SAikumar";
        Countalphabets cp = new Countalphabets();
        cp.countVowelsAndConsonant(word);

        String word1 = "Santosh kUmar";
        cp.countVowelsAndConsonant(word1);


    }
}
