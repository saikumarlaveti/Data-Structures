package RevisionTopics.TightCoupling;

public class Details {
    public static void main(String[] args) {
        SaikumarProfile sp = new SaikumarProfile();
        System.out.println(sp.id()+" "+sp.name()+" "+sp.age());

        SantoshProfile sk = new SantoshProfile();
        System.out.println(sk.id()+" "+sk.name()+" "+sk.age());
    }
}
