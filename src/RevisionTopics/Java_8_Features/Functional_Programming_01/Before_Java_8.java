package RevisionTopics.Java_8_Features.Functional_Programming_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Before_Java_8 {
    public static void main(String[] args) {
    List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<Integer> even = new ArrayList<>();
    for(Integer n:numbers) {
        if(n%2 ==0){
            even.add(n);
        }
    }
        System.out.println(even);
    }
}
