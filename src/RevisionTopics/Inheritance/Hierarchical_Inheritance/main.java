package RevisionTopics.Inheritance.Hierarchical_Inheritance;

public class main {
    public static void main(String[] args) {
        ElderSon es = new ElderSon();
        es.FatherProperty();
        YoungerSon ys = new YoungerSon();
        ys.FatherProperty();
        Daughter da = new Daughter();
        da.FatherProperty();
    }
}
