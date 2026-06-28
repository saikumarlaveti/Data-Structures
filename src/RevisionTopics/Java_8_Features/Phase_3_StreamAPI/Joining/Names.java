package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names {
    public static void main(String[] args) {
        //1. joining() →  just concatenate
        List<String> name = Arrays.asList(" LC_13_RomanToInteger "," Santosh "," naresh "," naveen ");
        String result = name.stream().collect(Collectors.joining());
        System.out.println(result);  //SaikumarSantoshnareshnaveen

        //2. joining(delimiter) →  add separator between elements
        String result1 = name.stream().collect(Collectors.joining(" :: "));
        System.out.println(result1); //LC_13_RomanToInteger,Santosh,naresh,naveen

        //3. joining(delimiter, prefix, suffix) →  add separator + start + end
        String result2 = name.stream().collect(Collectors.joining("-"," Hi "," Bye "));
        System.out.println(result2); //Hi  LC_13_RomanToInteger - Santosh - naresh - naveen  Bye


    }
}
