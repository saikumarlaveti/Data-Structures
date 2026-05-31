package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.List;


public class Student {
    public int id;
    public String name;
    public List<String> courses;

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

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
