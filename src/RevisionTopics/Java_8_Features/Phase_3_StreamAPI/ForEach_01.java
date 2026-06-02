package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEach_01 {
    public static void main(String[] args) {
        //Example - 1
        List<String> names = Arrays.asList("Java","Spring Boot","Mysql");
        System.out.println("without forEach( ) method :: ");
        for(int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("with forEach( ) method :: ");
        names.forEach(System.out::println);

        //Example -2
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println("without forEach( ) method :: ");
        for(int j = 0;j<nums.size();j++){
            if(nums.get(j)%2==0){
                System.out.println(nums.get(j));
            }
        }
        System.out.println("with forEach( ) method :: ");
        nums.stream().filter(n->n%2==0).forEach(System.out::println) ;

        //Example -3
        int[] arr = {5,6,7,8,9,10};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
