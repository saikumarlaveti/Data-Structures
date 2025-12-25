package RevisionTopics.Java_8_Features;

class test{
    test(String name){
        System.out.println("Test class constructors " + name);
    }
    test(){
        System.out.println("hello");
    }

}
interface interf{
    public test get(String name);
}

public class MethodReference_1 {
    public void game(){
        System.out.println("PUBG");
    }
    public static void main(String[] args) {
        interf j = test::new;
        test t1 = j.get("Saikumar");
        test t2 = j.get("Santosh");


    }
}
