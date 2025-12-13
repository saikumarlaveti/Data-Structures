package Leetcode;

public class LC_1071_GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder word = new StringBuilder();

        int s1 = str1.length()-1;
        int s2 = str2.length()-1;

        int i = 0;
        while(i<=s1 && i<=s2) {
            if (str1.charAt(i) == str2.charAt(i)) {
                word.append(str1.charAt(i));
                i++;
            } else {
                i++;
            }
        }
        return word.toString();
    }
    public static String gcdOfStrings1(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));

        System.out.println("---------------------------------");
        System.out.println(gcdOfStrings1(str1,str2));
        System.out.println(gcdOfStrings1("ABABAB","ABAB"));
    }
}
