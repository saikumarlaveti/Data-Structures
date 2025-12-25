package RevisionTopics.Encapsulations;

public class Student {

    private String name;
    private int id;

    public void setName(String name){
        if(name.length() > 3)
            this.name = name;
        else
            System.out.println("Invalid Name");
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }
        else {
            System.out.println("Invalid Id");
        }
    }

    public int getId() {
        return id;
    }
}
