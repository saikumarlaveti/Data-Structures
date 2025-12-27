package DataStructureClasses;

public class Class_04 {
    private static int sumOfChar(String number) {
        int sum = 0;
        for(int i = 0;i<number.length();i++){
            sum += number.charAt(i)-48;
            //1 --> 49 (ascii value) -48 = 1
            //2 --> 50 (ascii value) -48 = 2
            //3 --> 51 (ascii value) -48 = 3
    }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfChar("123"));
    }


}
