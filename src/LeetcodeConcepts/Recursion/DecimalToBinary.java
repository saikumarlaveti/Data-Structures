package LeetcodeConcepts.Recursion;

public class DecimalToBinary {
    public static int binaryFormat(int number){
        if(number ==1){
            return 1;
        }
        else{
            return number%2+10*binaryFormat(number/2);
        }
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        int a = 9;
        while(a!=1){
        s.append(a%2 + " ");
            a /= 2;
        }
        s.append(a);
        System.out.print(s.reverse());


        System.out.println(binaryFormat(8));
    }

}
