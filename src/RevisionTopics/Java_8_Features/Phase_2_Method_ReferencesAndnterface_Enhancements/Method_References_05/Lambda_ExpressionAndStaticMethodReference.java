package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Method_References_05;

import java.util.function.Function;

public class Lambda_ExpressionAndStaticMethodReference {
    public static int add(int a){
        return a+5;
    }
    public static void main(String[] args) {
        //without method reference
        Function<Integer,Integer> add = x -> Lambda_ExpressionAndStaticMethodReference.add(x);
        System.out.println(add.apply(2));

        //with method reference
        Function<Integer,Integer> add1 = Lambda_ExpressionAndStaticMethodReference::add;
        System.out.println(add1.apply(2));
    }
}
