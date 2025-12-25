package RevisionTopics.Java_8_Features;

import java.util.function.Predicate;
class demo {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i%2==0;
        System.out.println(p1.test(2)); //true
        System.out.println(p1.test(3));//false

        Predicate<String> p2 = s ->s.length()>5;
        System.out.println(p2.test("Saikumar")); // true
        System.out.println(p2.test("Hi")); // false

        String[] name = {"Saikumar","Doreamon","Tom","Jerry"};
        Predicate<String> p3 = names ->names.length()>5;
        for(String s : name){
            if(p3.test(s))
            {
                System.out.println(s);
            }
        }
    }
}


