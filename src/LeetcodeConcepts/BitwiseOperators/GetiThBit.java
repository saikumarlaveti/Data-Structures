package LeetcodeConcepts.BitwiseOperators;

public class GetiThBit {
    public int getithBit(int num,int i){
        int bitMask = 1<<i;
        if((num&bitMask)==0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
            GetiThBit gb = new GetiThBit();
        System.out.println(gb.getithBit(10,3));
        System.out.println(gb.getithBit(5,1));
        System.out.println(gb.getithBit(10,1));
    }
}
