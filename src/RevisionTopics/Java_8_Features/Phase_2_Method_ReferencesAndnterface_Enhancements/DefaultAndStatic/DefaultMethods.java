package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.DefaultAndStatic;

import List.LinkedList.DoubleLL.DoubleLinkedList;

import java.util.LinkedList;
import java.util.Stack;

public interface DefaultMethods {
    default void print() {
        System.out.println("Default Methods..");
    }

     void show(String name);
}
class car implements DefaultMethods{
    @Override
    public void show(String name) {
        System.out.println("My name is : " + name);
    }

    public static void main(String[] args) {
    car c= new car();
    c.show("LC_13_RomanToInteger");

    }
}

