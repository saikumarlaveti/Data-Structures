interface Empty{
    public void addition(int a, int b);
}

class EmptyImpl{
    public static void main(String[] args) {
        Empty e = (a,b)->System.out.println(a+b);
        e.addition(2,3);
    }
}