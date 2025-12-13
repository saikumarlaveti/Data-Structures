package Leetcode;

public class LC_415_AddStrings {
    public String addStrings(String num1,String num2){
        Long n1 = Long.parseLong(num1);
        int n2 = Integer.parseInt(num2);
        Long sum = n1+n2;

        String result = Long.toString(sum);


        return result;
    } // It Supports some text cases

    public String addStrings1(String num1,String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0 || carry != 0){
            int digit1 = i>=0?num1.charAt(i) - '0':0;
            int digit2 = j>=0?num2.charAt(j) - '0': 0;
            int total = digit1+ digit2+carry;
            carry = total/10;
            result.append(total%10);
            i--;
            j--;

        }   return result.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "6913259244";
        String num2 = "123";
        LC_415_AddStrings as = new LC_415_AddStrings();
     //   System.out.println(as.addStrings(num1,num2));
        System.out.println(as.addStrings1("123","456"));
    }
}
/*
converting String to Integer

int a = Integer.parseInt(num);
Long b = Long.parseLong(num);

converting Integer to String

String a = Integer.toString(num);
String b = Long.toString(num);

 */
