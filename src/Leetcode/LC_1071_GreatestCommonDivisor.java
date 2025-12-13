package Leetcode;

public class LC_1071_GreatestCommonDivisor {
    public static String gcdOfStrings(String str1, String str2)
    {
        if(!(str1+str2).equals(str2+str1)) return "";
        int a = str1.length();
        int b = str2.length();
        int gcd = 0;
        if(a>b){
//            a = a + b;
//            b = a - b;
//            a = a - b;
             gcd = findGCD(b,a);
        }
        else{
             gcd = findGCD(a,b);
        }

        StringBuilder result = new StringBuilder();
        result.append(str1.substring(0,gcd));
        return result.toString();
    }
    public static int findGCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1,str2)); //AB
        System.out.println(gcdOfStrings("ABCABC","ABC")); //ABC

    }
}
