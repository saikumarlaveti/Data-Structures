package LeetcodeConcepts.Recursion;

public class GreatestCommonFactor {
    //iteration
    public void gcd(int a,int b){
        while(b != 0){
             a = a%b;
             int temp = a;
             a = b;
            b = temp;
        }
        System.out.println(a);
    }

    //Recursion
    public int gcdRecursion(int a, int b){
        if(b==0){
            return a;
        }
        return gcdRecursion(b,a%b);
    }


    public static void main(String[] args) {
        GreatestCommonFactor gcd = new GreatestCommonFactor();
        gcd.gcd(32,68);
        System.out.println(gcd.gcdRecursion(68,32));
    }
}
