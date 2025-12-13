package LeetcodeConcepts.BitwiseOperators;

public class PowerOf2 {
    public boolean isPowerOfTwo(int num){
        if((1 & num) ==1){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        PowerOf2 po = new PowerOf2();
        System.out.println(po.isPowerOfTwo(2));
        System.out.println(po.isPowerOfTwo(16));
        System.out.println(po.isPowerOfTwo(5));
    }
}
