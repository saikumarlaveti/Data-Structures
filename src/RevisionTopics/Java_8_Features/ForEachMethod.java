package RevisionTopics.Java_8_Features;

import java.util.ArrayList;


public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Saikumar");
        names.add("Santosh Kumar");
        names.add("Lokesh");
        names.add("Pradeep");
        System.out.println("Normal Iteration Method");
        for(int i = 0;i< names.size();i++){
            System.out.print(names.get(i) +" ");
        }
        System.out.println();
        System.out.println("ForEach Method");
        names.forEach(i-> System.out.print(i+" "));
    }
}
