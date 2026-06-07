package LeetcodeConcepts.BitwiseOperators.Operations;

public class IntegerToBinary {
    public static String convertToBinary(int num){
        StringBuilder binary = new StringBuilder();
        while(num>=1){
            int result = num%2;
            binary.append(String.valueOf(result));
            num = num/2;
        }
        return binary.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToBinary(3)); //11
        System.out.println(convertToBinary(2)); //10
        System.out.println(convertToBinary(100000));  //11000011010100000
    }
}
