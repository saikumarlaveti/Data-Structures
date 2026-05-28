package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.DefaultAndStatic;

public interface StaticMethod {
    public static void show(){
        System.out.println("This is static block");
    }

}
class student implements StaticMethod{
    public static void main(String[] args) {
        StaticMethod.show();
    }
}
