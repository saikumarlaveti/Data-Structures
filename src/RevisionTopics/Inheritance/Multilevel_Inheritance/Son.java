package RevisionTopics.Inheritance.Multilevel_Inheritance;

public class Son extends Father {
    public void sonPropety()
    {
        System.out.println("son property 5 crores");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.grandFatherProperty();
        son.FatherProperty();
        son.sonPropety();

    }
}
