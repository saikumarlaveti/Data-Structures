package RevisionTopics.Java_8_Features.Functional_Interfaces_03.InterfaceAndAbstractClass;

public class AbstractClassIMPL extends AbstractClass {
    int id;
    String name;

    AbstractClassIMPL(int id,String name){
        this.id= id;
        this.name = name;
    }
    @Override
    int addition(int a, int b) {
        return a+b;
    }


    int subtraction(int a, int b) {
        return a-b;
    }

    int multiplication(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        AbstractClassIMPL ab = new AbstractClassIMPL(1,"Saikumar Laveti");
        System.out.println(ab.addition(2,3));
        System.out.println(ab.greet());
    }
}
