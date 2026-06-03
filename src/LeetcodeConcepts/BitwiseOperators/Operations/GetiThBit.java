package LeetcodeConcepts.BitwiseOperators.Operations;

public class GetiThBit {
    public int getithBit(int num,int i){
        int bitMask = 1<<i;
        System.out.println(num&bitMask);
        if((num&bitMask)==0)

            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
            GetiThBit gb = new GetiThBit();
        System.out.println(gb.getithBit(10,3));  // 1
        System.out.println(gb.getithBit(5,1));    // 0
        System.out.println(gb.getithBit(10,1));  // 1
    }
}
