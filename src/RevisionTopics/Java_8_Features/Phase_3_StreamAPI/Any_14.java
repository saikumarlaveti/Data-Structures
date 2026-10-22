package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Any_14 {
    public static void main(String[] args) {

         System.out.println("Operation\tQuestion it answers\tReturns true when\n" +
                "anyMatch()\tDoes at least one element match?\tOne or more elements match\n" +
                "allMatch()\tDo all elements match?\tEvery element matches\n" +
                "noneMatch()\tDoes no element match?\tZero elements match");

        System.out.println("Easy way to remember:\n" +
                "- any = at least one\n" +
                "- all = every one\n" +
                "- none = not even one");
        //1.anyMatch( )
        List<Integer> numbers =  Arrays.asList(1,3,5,8,9);
        boolean result = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(result); //true because fo 8

        List<Integer> number = Arrays.asList(1,3,5,7);
        boolean result1 = number.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(result1); // false because there is no even numbers

        //2.allMatch( )
        List<Integer> number1 = Arrays.asList(2,4,6,8);
        boolean result2 = number1.stream().allMatch(n -> n % 2 == 0);
        System.out.println(result2);  // true because of all are even numbers

        List<Integer> numbers2 = Arrays.asList(2,4,5,8);
        boolean result3 = numbers2.stream().allMatch(n -> n % 2 == 0);
        System.out.println(result3);  // false because of 5 is odd number

        //3.noneMatch( )
        List<Integer> numbers4 = Arrays.asList(1,3,5,7);
        boolean result4 = numbers4.stream().noneMatch(n -> n % 2 == 0);
        System.out.println(result4);  // true all elements are not matching the condition


        List<Integer> number5 = Arrays.asList(1,3,4,7);
        boolean result5 = number5.stream().noneMatch(n -> n % 2 == 0);
        System.out.println(result5); //false 4 is even number


         System.out.println("1. anyMatch - Check whether any number is even");
        int[] arr1 = {11, 15, 21, 24, 31};
// Check whether any number is even
        System.out.println(Arrays.stream(arr1).anyMatch(n->n%2==0));


        System.out.println("2. anyMatch - Check whether any number is greater than 50");
        int[] arr2 = {10, 20, 30, 40, 60};
// Check whether any number is greater than 50
        System.out.println(Arrays.stream(arr2).anyMatch(n->n>50));


        System.out.println("3. anyMatch - Check whether any name starts with S");
        String[] names3 = {"Ravi", "Kumar", "Sai", "John"};
// Check whether any name starts with S
        System.out.println(Arrays.stream(names3).anyMatch(n->n.startsWith("S")));


        System.out.println("4. allMatch - Check whether all numbers are positive");
        int[] arr4 = {10, 20, 30, 40, 50};
// Check whether all numbers are greater than 0
        System.out.println(Arrays.stream(arr4).allMatch(n->n>0));


        System.out.println("5. allMatch - Check whether all numbers are even");
        int[] arr5 = {12, 18, 22, 30, 44};
// Check whether all numbers are even
        System.out.println(Arrays.stream(arr5).allMatch(n->n%2==0));


        System.out.println("6. allMatch - Check whether all names have length greater than 3");
        String[] names6 = {"Ravi", "Kumar", "Santosh", "John"};
// Check whether every name has length greater than 3
        System.out.println(Arrays.stream(names6).map(String::length).allMatch(n->n>3));


        System.out.println("7. noneMatch - Check whether there are no negative numbers");
        int[] arr7 = {10, 20, 30, 40, 50};
// Check whether no number is negative
        System.out.println(Arrays.stream(arr7).noneMatch(n->n<0));


        System.out.println("8. noneMatch - Check whether there are no odd numbers");
        int[] arr8 = {2, 4, 6, 8, 10};
// Check whether no number is odd
        System.out.println(Arrays.stream(arr8).noneMatch(n->n%2==1));

        System.out.println("9. noneMatch - Check whether no name starts with A");
        String[] names9 = {"Ravi", "Sai", "Kumar", "John"};
// Check whether no name starts with A
        System.out.println(Arrays.stream(names9).noneMatch(s->s.startsWith("A")));

        System.out.println("10. Combine filter and match operations");
        int[] arr10 = {10, 15, 20, 25, 30};
// Check whether any number greater than 20 is divisible by 5
        System.out.println(Arrays.stream(arr10).filter(n->n>20).anyMatch(n->n%5==0));
    }
}
