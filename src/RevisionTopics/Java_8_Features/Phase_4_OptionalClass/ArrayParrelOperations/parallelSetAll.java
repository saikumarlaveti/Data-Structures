package RevisionTopics.Java_8_Features.Phase_4_OptionalClass.ArrayParrelOperations;

import java.util.Arrays;
import java.util.Random;

public class parallelSetAll {
    public static void main(String[] args) {
        // 1. Fill with index values
        int[] arr = new int[5];
        Arrays.parallelSetAll(arr,i->i);
        System.out.println(Arrays.toString(arr));   // [0, 1, 2, 3, 4]
        Arrays.parallelSetAll(arr,i->i*2);
        System.out.println(Arrays.toString(arr)); //  [0, 2, 4, 6, 8]

        Arrays.parallelSetAll(arr, i -> i * i);
        System.out.println(Arrays.toString(arr)); // [0, 1, 4, 9, 16]


        Random rand = new Random(42);
        double[] arr1 = new double[5];
        Arrays.parallelSetAll(arr1, i -> rand.nextDouble() * 100);
        System.out.println(Arrays.toString(arr1));// [73.4, 14.7, 60.2, 45.3, 88.1]  (approximate random values)

        String[] names = new String[5];
        Arrays.parallelSetAll(names, i -> "Item_" + i);
        System.out.println(Arrays.toString(names)); // [Item_0, Item_1, Item_2, Item_3, Item_4]
/*
        i.Fill with index values
        ii.Fill with multiples
        iii.Fill with squares
        iv.Fill with random values
        v.Fill String array
        vi.Fill with Fibonacci sequence
        vii.Fill Employee array in parallel
        viii.setAll() vs parallelSetAll() — Performance
        Internal Working of parallelSetAll()
 */


    }
}
