package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;

public class Filter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even Numbers :");
        Arrays.stream(arr).filter(n->n%2==0).forEach(System.out::println);
        System.out.println("Odd Numbers :");
        Arrays.stream(arr).filter(n->n%2==1).forEach(System.out::println);

        System.out.println("Without Filter API");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        for (int j : arr) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
