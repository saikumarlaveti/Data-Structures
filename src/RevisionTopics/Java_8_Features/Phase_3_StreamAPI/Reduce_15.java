package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_15 {
    public static void main(String[] args) {
        /*
        Java 8 Stream API — reduce()
Today, we will learn the reduce() method step by step, with simple examples and 10 practice exercises.
1. What is reduce()?
The reduce() method combines the elements of a stream into one single result.

For example, suppose we have an array:
int[] arr = {10, 20, 30, 40, 50};


We want to calculate the sum of all elements.
How reduction works
10+
20

+
30

+
40

+
50


reduce()

150
Single result


2. Syntax of reduce()
stream.reduce(identity, accumulator);


There are two important parts:
- Identity: The initial value of the result.
- Accumulator: The operation used to combine the current result with the next element.
For addition, the identity is usually 0. For multiplication, it is usually 1.
3. Example 1 — Sum of all numbers
Copy this code into Eclipse and run it.
import java.util.Arrays;

public class ReduceExample1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(arr)
                        .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);
    }
}


Output:
Sum: 150


How does it work?
The lambda (a, b) -> a + b combines two values at a time.
Step	a (current result)	b (next element)	Result
1	0	10	10
2	10	20	30
3	30	30	60
4	60	40	100
5	100	50	150

The initial value is 0, so the final result is 150.
4. Example 2 — Product of all numbers
import java.util.Arrays;

public class ReduceExample2 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};

        int product = Arrays.stream(arr)
                            .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);
    }
}


Output:
Product: 120


Calculation: \(1 \times 2 \times 3 \times 4 \times 5 = 120\).

Notice that the identity is 1, not 0. If we used 0 for multiplication, the result would always be zero.
5. Example 3 — Find the maximum number
import java.util.Arrays;

public class ReduceExample3 {
    public static void main(String[] args) {

        int[] arr = {25, 10, 80, 45, 60};

        int max = Arrays.stream(arr)
                        .reduce(Integer.MIN_VALUE,
                                (a, b) -> a > b ? a : b);

        System.out.println("Maximum: " + max);
    }
}


Output:
Maximum: 80


The expression a > b ? a : b keeps whichever number is larger.
6. Example 4 — Combine strings
reduce() also works with object streams, such as a stream of strings.
import java.util.Arrays;

public class ReduceExample4 {
    public static void main(String[] args) {

        String[] names = {"Java", "Spring", "SQL"};

        String result = Arrays.stream(names)
                              .reduce("", (a, b) -> a + b + " ");

        System.out.println(result.trim());
    }
}


Output:
Java Spring SQL


Here, "" is the initial empty string, and each name is appended to the accumulated result.
7. reduce() vs count() vs sum()
Method	Purpose	Example result
count()	Count elements	5
sum()	Add numbers in an IntStream	150
reduce()	Combine elements using a chosen operation	150, 120, etc.

reduce() is useful when you need a custom combination, such as multiplication, maximum, or combining strings. For a simple sum of an int[], sum() is usually more concise.

8. Your practice exercises — 10 questions
Try these yourself in Eclipse. For each question, write the complete Java code and print the result. Don't look for solutions yet—send me your answers, and I'll review them one by one.
Exercise 1 — Sum of numbers
int[] arr = {5, 10, 15, 20, 25};


Use reduce() to calculate the sum.

Expected output:
Sum: 75


Exercise 2 — Product of numbers
int[] arr = {2, 4, 5, 3};


Use reduce() to multiply all elements.

Expected output:
Product: 120


Exercise 3 — Find the maximum number
int[] arr = {12, 45, 7, 89, 34};


Use reduce() to find the largest number.

Expected output:
Maximum: 89


Exercise 4 — Find the minimum number
int[] arr = {45, 12, 78, 3, 29};


Use reduce() to find the smallest number.

Expected output:
Minimum: 3


Exercise 5 — Sum of even numbers
int[] arr = {10, 15, 20, 25, 30};


Use filter() and reduce() together to add only even numbers.

Expected output:
Sum of even numbers: 60


Exercise 6 — Sum of squares
int[] arr = {2, 3, 4, 5};


Use map() and reduce() to calculate the sum of the squares of all numbers.

Expected output:
Sum of squares: 54


Exercise 7 — Combine names
String[] names = {"Sai", "Ravi", "Kumar"};


Use reduce() to combine the names with a space between them.

Expected output:
Sai Ravi Kumar


Exercise 8 — Sum of numbers greater than 10
int[] arr = {5, 12, 8, 20, 15, 3};


Use filter() and reduce() to add only numbers greater than 10.

Expected output:
Sum: 47


Exercise 9 — Find the longest name
String[] names = {"Sai", "Ramesh", "Kumar", "Alexander"};


Use reduce() to find the longest name.

Expected output:
Longest name: Alexander


Exercise 10 — Sum of distinct numbers
int[] arr = {10, 20, 10, 30, 20, 40};


Use distinct() and reduce() to add each unique number only once.

Expected output:
Sum of distinct numbers: 100
        */
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
