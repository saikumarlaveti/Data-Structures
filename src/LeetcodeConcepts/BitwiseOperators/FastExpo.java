package LeetcodeConcepts.BitwiseOperators;

public class FastExpo {
    public int expo (int n,int pow){
        int ans = 1;
        while (pow>0){
            if((pow&1) == 1){
                ans = ans *n;
            }
            n = n * n;
            pow = pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        FastExpo fe = new FastExpo();
        System.out.println(fe.expo(5,2));
        System.out.println(fe.expo(5,3));
        System.out.println(fe.expo(10,3));

    }
}
