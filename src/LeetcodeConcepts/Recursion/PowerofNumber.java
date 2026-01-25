package LeetcodeConcepts.Recursion;

public class PowerofNumber {
    public static int powerOfaNumber(int number,int power){
        if(power==0){
            return 1;
        }

            return number * powerOfaNumber(number, power - 1);

    }
    public static void main(String[] args) {
        System.out.println(powerOfaNumber(3,2));
    }
}
