package LeetcodeConcepts.BitwiseOperators;

public class ClearithBit {
    public int clearBit(int num,int i){
        int mask = 1<<i;
        mask = ~mask;
        return num & mask;
    }
    public static void main(String[] args) {
        ClearithBit cb = new ClearithBit();
        System.out.println(cb.clearBit(10,1));  // 8
        /*
         1 0 1 0  --> 1  became zero result will be 8
         1 0 0  0
         -----------

        */
        System.out.println(cb.clearBit(10,2));  // 10
        System.out.println(cb.clearBit(10,3));  // 2

    }
}
