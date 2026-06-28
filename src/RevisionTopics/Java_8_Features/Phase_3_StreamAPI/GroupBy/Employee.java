package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    public int id;
    public String Name;
    public int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1,"LC_13_RomanToInteger",10000),
                new Employee(2,"DhanaKrishna",26000),
                new Employee(2,"DhanaKrishna",26000),
                new Employee(3,"Kavya",17000),
                new Employee(4,"Anjali",13000));


        Map<Integer,List<String>> salaryDetails= emp.stream().collect(Collectors.groupingBy(
                Employee::getSalary,
                Collectors.mapping(
                   //     Employee::getSalary,
                        Employee::getName,
                        Collectors.toList())

        )
        );
        System.out.println(salaryDetails);


    }
}
