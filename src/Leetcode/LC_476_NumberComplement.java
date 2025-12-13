package Leetcode;



public class LC_476_NumberComplement {
    public int findComplement(int num) {
     int mask = 1;
     while(mask<num){
         mask = (mask<<1) ;
         mask = mask | 1;

     }
     return num ^ mask;
    }

    public static void main(String[] args) {
            LC_476_NumberComplement nc = new LC_476_NumberComplement();
            System.out.println(nc.findComplement(5));
        System.out.println(nc.findComplement(1));

    }
}
