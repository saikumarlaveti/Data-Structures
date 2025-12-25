package Strings;

public class SubString {
    public void devide(String word)
    {
        int len = word.length();
        String[] arr = new String[len*(len+1)/2];
        int temp =0;
        for(int i = 0;i<len;i++)
        {
            for(int j = i;j<len;j++)
            {
                arr[temp] = word.substring(i,j+1);
                temp++;
            }
        }
        for(String i:arr)
        {
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        SubString sb = new SubString();
        String word = "FUN";
        sb.devide(word);

    }
}
