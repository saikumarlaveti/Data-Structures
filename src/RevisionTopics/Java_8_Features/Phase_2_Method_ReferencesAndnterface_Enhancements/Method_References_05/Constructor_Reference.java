package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Method_References_05;


public class Constructor_Reference {


    public static void main(String[] args) {
        Student s = Demo::new;
        s.get();
    }
}
