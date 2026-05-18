package RevisionTopics.Java_8_Features.Lambda_Expressions_02;

public class lambdaExpression {
    public static void main(String[] args) {
        Calculations cal = (a,b) -> System.out.println(a+b);
        cal.addition(5,9);
    }
}
