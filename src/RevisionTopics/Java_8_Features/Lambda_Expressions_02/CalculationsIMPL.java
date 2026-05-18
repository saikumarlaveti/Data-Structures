package RevisionTopics.Java_8_Features.Lambda_Expressions_02;

public class CalculationsIMPL implements  Calculations{
    @Override
    public void addition(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        CalculationsIMPL cal = new CalculationsIMPL();
        cal.addition(5,6);
    }
}
