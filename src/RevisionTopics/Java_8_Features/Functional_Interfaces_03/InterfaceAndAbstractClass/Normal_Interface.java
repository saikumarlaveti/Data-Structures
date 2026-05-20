package RevisionTopics.Java_8_Features.Functional_Interfaces_03.InterfaceAndAbstractClass;

public interface Normal_Interface {
     int addition(int a,int b);
    int subtraction(int a, int b);

    //methods
    //default method
    default int multication(int a,int b){
        return a*b;
    }
    default void wishMessage(){
        System.out.println("Hi, Welcome to the java 8 features");
    }
    abstract  int results();

    //static method

    static int division(int a,int b){
        return a%b;
    }
    static void greet(){
        System.out.println("Hi , Thank you for learning java 8 features ");
    }
}
