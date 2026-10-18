package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Count_10 {
    public static class Employee{
        String name ;
        int salary;
        public  Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8,9,10);
        //odd numbers
        System.out.println(numbers.stream().filter(n->n%2==1).count());  // 4
        //Even numbers
       long result =  numbers.stream().filter(n->n%2==0).count();  //5
        System.out.println(result);

        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen","Naresh");
        Long result1 = names.stream().filter(n->n.startsWith("S")).count(); //2
        System.out.println(result1);


        System.out.println("1.Count all numbers");
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        long result = Arrays.stream(arr).count();
        System.out.println(result);

        System.out.println("2.Count names");
        String[] names = new String[]{"Sai", "Ravi", "Kumar", "John", "Anil"};
        long result2 = Arrays.stream(names).count();
        System.out.println(result2);

        System.out.println("3.Count numbers greater than 20");
        int[] arr3 = new int[]{10, 25, 40, 15, 30, 50, 20, 60};
        long result3 = Arrays.stream(arr3).filter(n->n>20).count();
        System.out.println(result3);

        System.out.println("4.Count even numbers");
        int[] arr4 = new int[]{10, 15, 20, 25, 30, 35, 40, 45};
        long result4 = Arrays.stream(arr4).filter(n->n%2==0).count();
        System.out.println(result4);

        System.out.println("5.Count distinct numbers");
        int[] arr5 = new int[]{10, 20, 10, 30, 20, 40, 50, 30};
        long result5 = Arrays.stream(arr5).distinct().count();
        System.out.println(result5);

        System.out.println("6.Count names starting with S");
        String[] names6 = new String[]{"Sai", "Suresh", "Ravi", "Sanjay", "Kumar", "sita"};
        long result6 = Arrays.stream(names6).filter(n->n.toUpperCase().startsWith("S")).count();
        System.out.println(result6);

        System.out.println("7.Count strings with length greater than 4");
        String[] names7 = new String[]{"Sai", "Ravi", "Kumar", "John", "Ramesh", "Anil"};
        long result7 = Arrays.stream(names7).filter(s->s.length()>4).count();
        System.out.println(result7);

        System.out.println("8.Count employees earning more than 45,000");
        List<Peek.Employee> employees = Arrays.asList(
                new Peek.Employee("Sai", 50000),
                new Peek.Employee("Ravi", 40000),
                new Peek.Employee("John", 65000),
                new Peek.Employee("Kumar", 45000)
        );

        long result8 = employees.stream().filter(e->e.getSalary()>45000).count();
        System.out.println(result8);

        System.out.println("9.Count distinct numbers in nested lists");
        List<List<Integer>> numbers9 = Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(20, 40, 50),
                Arrays.asList(30, 60, 70)
        );

        long result9 = numbers9.stream().flatMap(Collection::stream).distinct().count();
        System.out.println(result9);

        System.out.println("10.Filter numbers greater than 10.\n" +
                "Double each number using map().\n" +
                "Remove duplicates using distinct().\n" +
                "Sort in descending order.\n" +
                "Count the final elements using count().");

        int[] arr10 = new  int[]{5, 12, 15, 20, 12, 25, 30, 15, 40};
        long result10 = Arrays.stream(arr10).filter(n->n>10)
                .map(n->n*2)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .count();
        System.out.println(result10);

    }
}
