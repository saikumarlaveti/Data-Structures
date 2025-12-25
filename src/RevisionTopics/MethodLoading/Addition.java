package RevisionTopics.MethodLoading;

public class Addition {
    public void add(int a)
    {
        System.out.println(a);
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }

    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(2);
        addition.add(2,3);
        addition.add(2,3,4);
    }
}
