package RevisionTopics.Java_8_Features.Functional_Interfaces_03.InterfaceAndAbstractClass;

public class Normal_InterfaceIMPL implements Normal_Interface{
    @Override
    public int addition(int a, int b) {
        return 0;
    }

    @Override
    public int subtraction(int a, int b) {
        return 0;
    }

    @Override
    public int multication(int a, int b) {
        return Normal_Interface.super.multication(a, b);
    }

    @Override
    public void wishMessage() {
        Normal_Interface.super.wishMessage();
    }

    @Override
    public int results() {
        return 0;
    }
}



