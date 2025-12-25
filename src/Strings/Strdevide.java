package Strings;

public class Strdevide {
    public  void stringDevider(String names)
    {
        int length = names.length();
        int temp = 0;
        int n = 2;
        int split = length/n;
        String name[] = new String[2];
        for(int i = 0;i<length;i = i+split){
            String part = names.substring(i,i+split);
            name [temp] = part;
            temp++;
        }

        for(String call:name){
            System.out.println(call);
        }
    }
    public static void main(String[] args) {
        String names = "Saikumar";
        Strdevide str = new Strdevide();
        str.stringDevider(names);
    }
}
