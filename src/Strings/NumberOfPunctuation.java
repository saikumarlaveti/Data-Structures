package Strings;

public class NumberOfPunctuation {
    public void countPun(String word)
    {
        int count = 0;
        for(int i  =0;i<word.length();i++)
        {
            if(word.charAt(i) == '?' || word.charAt(i) == '!' || word.charAt(i) == '-')
                count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args)
    {
        String word = "?!dHello-";
        NumberOfPunctuation nop = new NumberOfPunctuation();
        nop.countPun(word);
    }

}
