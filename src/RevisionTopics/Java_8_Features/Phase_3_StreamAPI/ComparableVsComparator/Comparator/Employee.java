package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.ComparableVsComparator.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee  {
    public int id;
    public String name;
    public int age;

    public  Employee(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(4,"Saikumar",24),
                new Employee(1,"Santosh",26),
                new Employee(7,"Hema",23)
        );

    //age comparator
        Collections.sort(emp,new AgeComparator());
        System.out.println(emp);//[7 Hema 23, 4 Saikumar 24, 1 Santosh 26]


        // id comparator
        Collections.sort(emp,new IdComparator());
        System.out.println(emp);  //[1 Santosh 26, 4 Saikumar 24, 7 Hema 23]





    }


}
