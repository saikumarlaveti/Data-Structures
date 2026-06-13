package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names {
    public static void main(String[] args) {
        //1. joining() →  just concatenate
        List<String> name = Arrays.asList(" Saikumar "," Santosh "," naresh "," naveen ");
        String result = name.stream().collect(Collectors.joining());
        System.out.println(result);  //SaikumarSantoshnareshnaveen

        //2. joining(delimiter) →  add separator between elements
        String result1 = name.stream().collect(Collectors.joining(" :: "));
        System.out.println(result1); //Saikumar,Santosh,naresh,naveen

        //3. joining(delimiter, prefix, suffix) →  add separator + start + end
        String result2 = name.stream().collect(Collectors.joining("-"," Hi "," Bye "));
        System.out.println(result2); //Hi  Saikumar - Santosh - naresh - naveen  Bye


    }
}
