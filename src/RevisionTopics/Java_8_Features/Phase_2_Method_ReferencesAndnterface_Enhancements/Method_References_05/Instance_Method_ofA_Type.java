package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Method_References_05;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Instance_Method_ofA_Type {
    public static void main(String[] args) {
        Function<String,String> uppercase = String::toUpperCase;
        System.out.println(uppercase.apply("saikumar"));  //SAIKUMAR

        Consumer<int[] > sort = arr->Arrays.sort(arr);
        int[] array = {5,4,3,2,1};
        sort.accept(array);
        System.out.println(Arrays.toString(array));  // [1, 2, 3, 4, 5]
    }
}
