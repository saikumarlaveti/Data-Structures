package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Primitive_Streams;

import java.util.stream.IntStream;

public class Real_World_Examples {
    public static void main(String[] args) {
        //1. Sum of first N natural numbers
        int n = 10;
       int sum =  IntStream.rangeClosed(1,n).sum();
        System.out.println(sum);

        //  2.Print multiplication table
        int no = 10;
        IntStream.rangeClosed(1,10).forEach(i->System.out.println(no + " * " + i + " = " + no*i ));

        //  3.Find prime numbers in range

       // 4.Factorial using reduce
        int factorial = IntStream.rangeClosed(1,5).reduce(1,(a,b)->a*b);
        System.out.println(factorial);  //120
       // 5.Sum of squares

        int sumOfSquares = IntStream.rangeClosed(1,5).map(a->a*a).sum();
        System.out.println(sumOfSquares);


    }
}
