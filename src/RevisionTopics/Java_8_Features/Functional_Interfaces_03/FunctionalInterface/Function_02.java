package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.Function;

public class Function_02 {
    public static void main(String[] args) {
        Function<Integer,Integer> squreOfNum = num -> num * num;
        System.out.println(squreOfNum.apply(2));  //4
        System.out.println(squreOfNum.apply(3));  //9

        Function<String,Integer> StringOfLen = num -> num.length();
        System.out.println(StringOfLen.apply("Saikumar"));  // 8
        System.out.println(StringOfLen.apply("Laveti"));  // 6

        Function<String,String> UpperCase = name -> name.toUpperCase();
        System.out.println(UpperCase.apply("saikumar")); //SAIKUMAR

        //2.andThen()

        Function<Integer,Integer> add = num -> num+num; // 20 * 20 = 40
        Function<Integer,Integer> sub  = num -> num -10; //40 -10 = 30

        Function<Integer,Integer> maths = add.andThen(sub);

        System.out.println(maths.apply(20)); //30

        //3.compose()

        Function<Integer,Integer> add_01 = num -> num*num; // 10 * 10 = 100
        Function<Integer,Integer> sub_01  = num -> num -10; //20 -10 = 10

        Function<Integer,Integer> math_01 = add_01.compose(sub_01);
        System.out.println(math_01.apply(20));  //100

        //4.identity()

        Function<String,String> name = Function.identity();
        System.out.println(name.apply("Saikumar")); //Saikumar


    }
}

