package Leetcode;

public class LC_2427_NumberOfCommonFactors {
    public  static int commonFactors(int a, int b) {
        int count = 0;
        int temp = 0;
        while(b !=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        for(int i = 1;i<=a;i++){
            if(a%i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(commonFactors(6,12));
        System.out.println(commonFactors(25,30));
    }
}
