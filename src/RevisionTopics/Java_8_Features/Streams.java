package RevisionTopics.Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(45);
        l.add(22);
        l.add(4);
        l.add(97);
        System.out.println(l);
        List<Integer> list = l.stream().filter((i)->i%2==0).collect(Collectors.toList()); //filter method uses to filtering the objects -->default it uses Predicate interface
        System.out.println(list);

        List<Integer> add = l.stream().map(i->i+5).collect(Collectors.toList()); // map method used to apply some action --> default it uses Function interface
        System.out.println(add);

        List<Integer> failed = l.stream().filter(m->m<35).collect(Collectors.toList());
        System.out.println(failed);

        //sorted
        System.out.println("Sorted - sorted( )");
        List<Integer> sort = l.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
        //count
       long failed_1 = l.stream().filter(m->m<35).count();
        System.out.println(failed_1);

        Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);

        Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
        System.out.println("Stopped");
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(8);
        elements.add(33);
        elements.add(27);
        elements.add(45);
        elements.add(57);
        System.out.println(elements);

        Consumer<Integer> c = i->{
            System.out.println("The Square of i is - "+i*i);
        };
        elements.stream().forEach(c);
        System.out.println("Stopped");

        elements.stream().forEach((i-> System.out.println("The Square of i is - " +(i*i))));

        System.out.println("print");
        List<Integer> num = Arrays.asList(4,5,6,2,3,9);
        List<Integer>num1 = num.stream().map(i->i*2).toList();
        List<Integer>num2 = num.stream().filter(i->i%2==0).map(j->j*2).toList();
        Consumer<List<Integer>> ta = i-> System.out.println(i);
        ta.accept(num1);
        ta.accept(num);
        System.out.println("Hello World");
        ta.accept(num2);


    }
}
