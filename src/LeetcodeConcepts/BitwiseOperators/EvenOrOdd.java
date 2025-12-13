package LeetcodeConcepts.BitwiseOperators;

public class EvenOrOdd {
    public void evenOrOdd(int num){
        if((num&1)==1)
            System.out.println("Odd Number");
        else
            System.out.println("Even Number");
    }
    public static void main(String[] args) {
            EvenOrOdd eo = new EvenOrOdd();
            eo.evenOrOdd(4); // even
            eo.evenOrOdd(3); // odd
            System.out.println(4&1);  // 0
            System.out.println(3&1);  // 1
    }
}
