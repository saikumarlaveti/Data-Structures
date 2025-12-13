package LeetcodeConcepts.BitwiseOperators;

public class SetIthBit {
    public void setBit(int num,int i){
        int mask = 1 <<i;
        num = num|mask;
        System.out.println(num);
    }
    public static void main(String[] args) {
            SetIthBit sb = new SetIthBit();
            sb.setBit(10,2);  // 14
            sb.setBit(10,1);   // 10
            sb.setBit(2,0);  // 3
    }
}
