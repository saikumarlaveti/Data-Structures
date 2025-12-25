package Strings;

public class NumberOfCharacters {
    public void characterLength(String word)
    {
        char[] charas = word.toCharArray();
        System.out.println(charas.length);

    }
    public void anotherMethod(String word)
    {
        int count = 0;
        for(int i  =0;i<word.length();i++)
        {
            if(word.charAt(i) != ' ')
                count++;
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        NumberOfCharacters noc = new NumberOfCharacters();
        noc.characterLength("Saikumar");//8
        noc.characterLength("Santosh Kumar");//13

        noc.anotherMethod("Saikumar");//8
        noc.anotherMethod("Santosh Kumar");//12

    }
}
