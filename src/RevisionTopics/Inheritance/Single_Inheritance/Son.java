package RevisionTopics.Inheritance.Single_Inheritance;


public class Son extends Father {
    public void fatherproperty()
    {
        System.out.println(money+" "+earth);
    }

    public static void main(String[] args) {
        Son  son = new Son();
        son.fatherproperty();
        son.details();
    }
}
