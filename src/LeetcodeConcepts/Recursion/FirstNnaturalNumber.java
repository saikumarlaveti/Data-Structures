package LeetcodeConcepts.Recursion;

public class FirstNnaturalNumber {
    public static int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        else {
            return n + sumOfNaturalNumber(n - 1);
        }

    }
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(2));
    }
}
