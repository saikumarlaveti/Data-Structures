@FunctionalInterface
interface Empty{
     void addition(int a, int b);
     //void subtraction(int a,int b);
}

class EmptyImpl{
    public static void main(String[] args) {
        Empty e = (a,b)->System.out.println(a+b);
        Empty e1 = (a,b) -> System.out.println(a-b);
        e.addition(2,3);
        e1.addition(2,3);
    }
}