package LeetcodeConcepts.BitwiseOperators;

public class ClearLastiBits {
    public int clearLast(int num,int pos){
        int mask = (~0) << pos;
        return num & mask;
    }
    public static void main(String[] args) {
        ClearLastiBits clb  = new ClearLastiBits();
        System.out.println(clb.clearLast(15,2));
    }
}
