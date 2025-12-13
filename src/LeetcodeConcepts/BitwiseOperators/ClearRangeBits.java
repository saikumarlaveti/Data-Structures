package LeetcodeConcepts.BitwiseOperators;

public class ClearRangeBits {
    public int clearBitWithRange(int num , int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return num & bitMask;
    }
    public static void main(String[] args) {
            ClearRangeBits crb = new ClearRangeBits();
            System.out.println(crb.clearBitWithRange(10,2,4));
        System.out.println(crb.clearBitWithRange(10,1,4));
        System.out.println(crb.clearBitWithRange(5,1,2));
    }
}
