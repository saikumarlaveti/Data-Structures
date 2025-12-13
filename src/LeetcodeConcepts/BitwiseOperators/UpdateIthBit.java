package LeetcodeConcepts.BitwiseOperators;

public class UpdateIthBit {
    public int clearBit(int num,int i){
        int mask  = 1<<i;
        mask = ~mask;
        return num & mask;
    }
    public int changeBit(int num,int pos, int newBit){
        int n  = clearBit(num,pos);
        int mask =  newBit << pos;
        return n | mask;

    }
    public static void main(String[] args) {
            UpdateIthBit ub = new UpdateIthBit();
            System.out.println(ub.changeBit(10,3,1));
            System.out.println(ub.changeBit(10,0,1));
        System.out.println(ub.changeBit(8,2,1));
        System.out.println(ub.changeBit(8,3,0));
    }
}
