package RevisionTopics.Java_8_Features.Functional_Interfaces_03.InterfaceAndAbstractClass;

public class AbstractClassIMPL extends AbstractClass {
    @Override
    int addition(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        AbstractClassIMPL ab = new AbstractClassIMPL();
        ab.addition(2,3);
       ab.greet();
    }
}
