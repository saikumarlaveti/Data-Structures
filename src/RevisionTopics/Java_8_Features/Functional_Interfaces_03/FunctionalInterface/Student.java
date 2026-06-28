package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

public class Student{
    public static void main(String[] args) {
        StudnetInterface si = (name) -> System.out.println("Student name : " + name);
        si.name("LC_13_RomanToInteger Laveti");
        si.name("Santosh Kumar");

        CalculatorInterface cf = (int a,int b)->{return a+b;};
        System.out.println(cf.add(4,5));
    }
}
