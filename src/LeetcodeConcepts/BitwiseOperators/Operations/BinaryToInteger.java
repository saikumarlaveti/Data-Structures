package LeetcodeConcepts.BitwiseOperators.Operations;

public class BinaryToInteger {
    public static int convertBinaryToInteger(String num){
        double result = 0;
        int index = 0;
        char arr[] = new char[num.length()];
        arr = num.toCharArray();


        for(int i  = arr.length-1;i>=0;i--){
            int n = Integer.parseInt(String.valueOf(arr[i]));
           double test  = Math.pow(2,index++)*n;
           result += test;
        }
        return (int) result;
    }
    public static void main(String[] args) {
        String num = "1010";
        System.out.println(convertBinaryToInteger(num));
        System.out.println(convertBinaryToInteger("11000011010100000"));
    }
}
