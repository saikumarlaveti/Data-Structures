package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer> >list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9));

        list.stream().map(l->l.stream()).forEach(System.out::println);
        /*
        java.util.stream.ReferencePipeline...
        java.util.stream.ReferencePipeline...
         java.util.stream.ReferencePipeline...
         */
         list.stream().flatMap(list1->list1.stream()).forEach(System.out::println);
         list.stream().flatMap(l->l.stream().map(l1->l1*2)).forEach(System.out::println);

         List<List<String>> names = Arrays.asList(
                 Arrays.asList("Saikumar,Santosh"),
                 Arrays.asList("Naveen","Naresh"),
                 Arrays.asList("Ganesh","Eswara Rao")
         );

         names.stream().flatMap(n->n.stream()).forEach(System.out::println);
         /*
         Saikumar,Santosh
        Naveen
        Naresh
        Ganesh
        Eswara Rao
          */

        List<String> single = names.stream().flatMap(s->s.stream()).toList();
        System.out.println(single);

        List<String> word = Arrays.asList("Saikumar");
        List<String>charas = word.stream().flatMap(w->Arrays.stream(w.split(""))).collect(Collectors.toList());
        System.out.println(charas);


    }
}
