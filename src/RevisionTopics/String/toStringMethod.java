package RevisionTopics.String;

public class toStringMethod {
    int id;
    String name;
    public toStringMethod(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "id " + id + " name " + name;
    }

    public static void main(String[] args) {
        toStringMethod tsm = new toStringMethod(1,"saikumar");
        System.out.println(tsm); //String.toStringMethod@7b23ec81 -->without using tostring method


    }
}
