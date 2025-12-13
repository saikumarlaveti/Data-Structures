package LeetcodeConcepts.BitwiseOperators;

public class CountSetBits { // countsetbitmeans --> number of one's --1's
    public int  countSetBit(int num){
        int count = 0;
        while(num>0){
            if((num&1) == 1)
                count++;
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        CountSetBits csb = new CountSetBits();
        System.out.println(csb.countSetBit(10));
        System.out.println(csb.countSetBit(8));
    }
}
