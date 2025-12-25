package RevisionTopics.Java_8_Features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
     int id;
     String name;
     int salary;
     Employee(int id, String name, int salary){
         this.id = id;
         this.name = name;
         this.salary = salary;
     }

     public static void main(String[] args) {
         ArrayList<Employee> al = new ArrayList();
         al.add(new Employee(1,"Saikumar",400));
         al.add(new Employee(2,"Santosh",600));
         al.add(new Employee(3,"Lokesh",800));
         al.add(new Employee(4,"hari",7000));
         al.add(new Employee(5,"Naveen",100));

         Predicate<Employee> p1 = e->e.salary>500;
         for (Employee e :al){
             if(p1.test(e))
                System.out.println(e.name + " " + e.salary);
         }


         int[] arr = {1,2,3,4,10,20,30,45};
         Predicate<Integer> p2 = i -> i%2== 0;
         Predicate<Integer> p3 = i -> i>10;

         //and( ) , or ( ) and negate ( )
         System.out.println("Number is even and greater than 10");

         for(int x :arr){
             if(p2.and(p3).test(x)){
                 System.out.println(x);
             }
         }
         System.out.println("Number is even or greater than 10");

         for(int x :arr){
             if(p2.or(p3).test(x)){
                 System.out.println(x);
             }
         }

         System.out.println("Number not even");

         for(int x :arr){
             if(p2.negate().test(x)){
                 System.out.println(x);
             }
         }

     }
 }