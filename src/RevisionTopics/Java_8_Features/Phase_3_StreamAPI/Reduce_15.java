package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_15 {
    public static void main(String[] args) {
        //sum
        List<Integer> num = Arrays.asList(1,2,3,4,5);
       Optional<Integer> result =  num.stream().reduce((a, b)->a+b);
        System.out.println(result.get());

        //sum
        int result1 =  num.stream().reduce(0,Integer::sum);
        System.out.println(result1);

        //Multiplication
        int result2 = num.stream().reduce(1,(a,b)->a*b);
        System.out.println(result2);

        //Find Max element
        int result3 = num.stream().reduce(0,Integer::max);
        System.out.println(result3);
        int result4 = num.stream().reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println(result4);

        List<String> names =
                Arrays.asList("Java","Spring","Boot");

        String result5 = names.stream().reduce("",(a,b) -> a+b);
        System.out.println(result5);

         System.out.println("1.Sum of numbers");
        int[] arr1 = {5, 10, 15, 20, 25};
        //int sum = Arrays.stream(arr).reduce(0,(a,b)->a+b);
        int sum = Arrays.stream(arr1).reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("2.Product of numbers");
        int[] arr2 = {2, 4, 5, 3};
        int mul = Arrays.stream(arr2).reduce(1,(a,b)->a*b);
        System.out.println(mul);

        System.out.println("3.Find the maximum number");
        int[] arr3 = {12, 45, 7, 89, 34};
        int max = Arrays.stream(arr3).reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);

        System.out.println("4.Find the minimum number");
        int[] arr4 = {45, 12, 78, 3, 29};
        int min = Arrays.stream(arr4).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);

        System.out.println("5.Sum of even numbers");
        int[] arr5 = {10, 15, 20, 25, 30};
        int evenSum = Arrays.stream(arr5).filter(n->n%2==0).reduce(0,Integer::sum);
        System.out.println(evenSum);

        System.out.println("6.Sum of squares");
        int[] arr6 = {2, 3, 4, 5};
        int sumOfSquares = Arrays.stream(arr6).map(n->n*n).reduce(0,Integer::sum);
        System.out.println(sumOfSquares);

        System.out.println("7.Combine names");
        String[] names = {"Sai", "Ravi", "Kumar"};
        String names7 =  Arrays.stream(names).reduce("",(a,b)->a+b+" ");
        System.out.println(names7);

        System.out.println("8.Sum of numbers greater than 10");
        int[] arr8 = {5, 12, 8, 20, 15, 3};
        int sum8 = Arrays.stream(arr8).filter(n->n>10).reduce(0,Integer::sum);
        System.out.println(sum8);

        System.out.println("9.Find the longest name");
        String[] names9 = {"Sai", "Ramesh", "Kumar", "Alexander"};
        String longestName = Arrays.stream(names9).reduce("",(a,b)->a.length()>b.length()?a:b);
        System.out.println(longestName);

        System.out.println("10.Sum of distinct numbers");
        int[] arr10 = {10, 20, 10, 30, 20, 40};
        int sum10 = Arrays.stream(arr10).distinct().reduce(0,Integer::sum);
        System.out.println(sum10);

// Q11. Find the maximum, including negative numbers
        int[] arr11 = {-10, -20, -5, -30};
        int maximumNumber = Arrays.stream(arr11).reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(maximumNumber);
// Expected: -5

// Q12. Find the shortest name
        String[] names12 = {"Ravi", "Sai", "Alexander", "John"};
        String shortestName = Arrays.stream(names12)
                .reduce((a, b) -> a.length() <= b.length() ? a : b)
                .orElse("");
        System.out.println(shortestName);

// Q13. Find the product of odd numbers
        int[] arr13 = {2, 3, 4, 5, 6, 7};
        int product = Arrays.stream(arr13).filter(n->n%2==1).reduce(1,(a,b)->a*b);
        System.out.println(product);
// Expected: 105

        System.out.println("14.Find the minimum negative number.");
        int[] arr14 = {-15, -8, -40, -2, -25};
        int minimumNegative  = Arrays.stream(arr14).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(minimumNegative);

        System.out.println("15.Find the longest name using reduce().");
        String[] names15 = {"Java", "SpringBoot", "SQL", "Microservices"};

        String longestName15 = Arrays.stream(names15).reduce("",(a,b)->a.length()>b.length()?a:b);
        System.out.println(longestName15);


    }
}
