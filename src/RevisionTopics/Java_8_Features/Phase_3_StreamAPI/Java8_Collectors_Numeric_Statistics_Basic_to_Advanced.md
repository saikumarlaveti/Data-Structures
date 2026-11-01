# Java 8 Collectors: Numeric Aggregation and Statistics

**Beginner-to-advanced student guide** | Java 8 | GitHub-ready

## Learning goals

After this guide, you can:
- Explain `summingInt`, `averagingInt`, and `summarizingInt`.
- Choose the correct result type and handle empty streams.
- Aggregate values from numbers, strings, and business objects.
- Combine collectors with `filter`, `map`, `groupingBy`, and `partitioningBy`.
- Avoid integer overflow and understand numeric precision.
- Solve practical exercises and interview questions.

## Prerequisites and setup

You should know Java lists, lambdas, and basic streams. All examples use **Java 8**, not newer APIs such as `Stream.toList()`.

Imports used throughout:

```java
import java.util.*;
import java.util.stream.*;
```

Unless otherwise specified, snippets can be placed inside `public static void main(String[] args)` in a class. Each section is independent; avoid reusing local variable names in the same method.

## 1. The big picture

Suppose these are monthly sales amounts:

```java
List<Integer> sales = Arrays.asList(10000, 20000, 30000, 40000, 50000);
```

| Collector | Question answered | Result | Type |
|---|---|---|---|
| `summingInt(n -> n)` | How much in total? | `150000` | `Integer` |
| `averagingInt(n -> n)` | What is the average? | `30000.0` | `Double` |
| `summarizingInt(n -> n)` | What are all basic statistics? | count=5, sum=150000, min=10000, max=50000, average=30000.0 | `IntSummaryStatistics` |

All three are **terminal collection operations** used via `stream.collect(...)`. The argument is a *mapper* that extracts an `int` from each stream element.

## 2. `Collectors.summingInt()` — total

### Syntax

```java
Collectors.summingInt(element -> integerValue)
```

### Complete runnable example

```java
import java.util.*;
import java.util.stream.Collectors;

public class SummingIntDemo {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(10000, 20000, 30000, 40000);
        Integer total = salaries.stream()
                .collect(Collectors.summingInt(n -> n));
        System.out.println(total); // 100000
    }
}
```

Step by step: the stream visits each salary, the mapper returns the integer value, and the collector accumulates the sum.

### Filter before summing

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
Integer evenTotal = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.summingInt(n -> n));
System.out.println(evenTotal); // 60
```

### Sum string lengths

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Kumar", "John");
Integer totalCharacters = names.stream()
        .collect(Collectors.summingInt(String::length));
System.out.println(totalCharacters); // 16
```

## 3. `Collectors.averagingInt()` — average

Average = sum / count. The result type is **Double**, even when the result is a whole number.

```java
List<Integer> marks = Arrays.asList(60, 70, 80, 90, 100);
Double average = marks.stream()
        .collect(Collectors.averagingInt(n -> n));
System.out.println(average); // 80.0
```

### Fractional average

```java
List<Integer> scores = Arrays.asList(1, 2);
Double avg = scores.stream().collect(Collectors.averagingInt(n -> n));
System.out.println(avg); // 1.5
```

### Average of filtered elements

```java
List<Integer> salaries = Arrays.asList(20000, 30000, 40000, 50000, 60000);
Double highSalaryAverage = salaries.stream()
        .filter(s -> s > 30000)
        .collect(Collectors.averagingInt(s -> s));
System.out.println(highSalaryAverage); // 50000.0
```

**Important:** On an empty stream, `averagingInt` returns `0.0`, not `OptionalDouble`.

## 4. `Collectors.summarizingInt()` — all five statistics

`IntSummaryStatistics` provides `getCount()`, `getSum()`, `getMin()`, `getMax()`, and `getAverage()`.

```java
List<Integer> marks = Arrays.asList(60, 70, 80, 90, 100);
IntSummaryStatistics stats = marks.stream()
        .collect(Collectors.summarizingInt(n -> n));

System.out.println("Count: " + stats.getCount());     // 5
System.out.println("Sum: " + stats.getSum());         // 400
System.out.println("Min: " + stats.getMin());         // 60
System.out.println("Max: " + stats.getMax());         // 100
System.out.println("Average: " + stats.getAverage()); // 80.0
```

Use this when a report needs several statistics from the same input, rather than calculating each in a separate stream traversal.

### Empty stream behavior

```java
List<Integer> empty = Collections.emptyList();
System.out.println(empty.stream().collect(Collectors.summingInt(n -> n))); // 0
System.out.println(empty.stream().collect(Collectors.averagingInt(n -> n))); // 0.0

IntSummaryStatistics stats = empty.stream()
        .collect(Collectors.summarizingInt(n -> n));
System.out.println(stats.getCount());   // 0
System.out.println(stats.getSum());     // 0
System.out.println(stats.getAverage()); // 0.0
System.out.println(stats.getMin());     // 2147483647 (Integer.MAX_VALUE)
System.out.println(stats.getMax());     // -2147483648 (Integer.MIN_VALUE)
```

For business reports, check `stats.getCount() > 0` before interpreting minimum and maximum.

## 5. Working with objects: employee salary report

This full example is standalone and runnable:

```java
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStatsDemo {
    static class Employee {
        private final String name;
        private final String department;
        private final int salary;

        Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
        String getName() { return name; }
        String getDepartment() { return department; }
        int getSalary() { return salary; }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sai", "IT", 40000),
                new Employee("Ravi", "HR", 30000),
                new Employee("Kumar", "IT", 50000),
                new Employee("John", "HR", 35000)
        );

        Integer total = employees.stream()
                .collect(Collectors.summingInt(Employee::getSalary));
        Double average = employees.stream()
                .collect(Collectors.averagingInt(Employee::getSalary));
        IntSummaryStatistics summary = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getSalary));

        System.out.println("Total: " + total);     // 155000
        System.out.println("Average: " + average); // 38750.0
        System.out.println("Min: " + summary.getMin()); // 30000
        System.out.println("Max: " + summary.getMax()); // 50000
    }
}
```

**Why `Employee::getSalary`?** Each stream element is an `Employee`, not an `Integer`. The mapper extracts the numeric salary to aggregate.

## 6. Intermediate-to-advanced: nested collectors

The following snippets use the `Employee` class and `employees` list from Section 5.

### Total salary by department

```java
Map<String, Integer> totals = employees.stream()
        .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.summingInt(Employee::getSalary)
        ));
// IT=90000, HR=65000 (map entry order may differ)
```

### Average salary by department

```java
Map<String, Double> averages = employees.stream()
        .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingInt(Employee::getSalary)
        ));
// IT=45000.0, HR=32500.0
```

### Full salary statistics by department

```java
Map<String, IntSummaryStatistics> byDepartment = employees.stream()
        .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.summarizingInt(Employee::getSalary)
        ));

byDepartment.forEach((department, summary) ->
        System.out.println(department + " -> count=" + summary.getCount()
                + ", total=" + summary.getSum()
                + ", average=" + summary.getAverage()));
```

### Statistics for employees above a salary threshold

```java
IntSummaryStatistics highEarners = employees.stream()
        .filter(e -> e.getSalary() > 35000)
        .collect(Collectors.summarizingInt(Employee::getSalary));
// count=2, sum=90000, min=40000, max=50000, average=45000.0
```

### Partition and aggregate in one collection

```java
Map<Boolean, Integer> salaryTotals = employees.stream()
        .collect(Collectors.partitioningBy(
                e -> e.getSalary() > 35000,
                Collectors.summingInt(Employee::getSalary)
        ));
// true=90000, false=65000
```

`partitioningBy` always provides both boolean keys. Its downstream collector computes the result separately within each partition.

## 7. Advanced: numeric types, overflow and precision

### `summingInt` vs `summingLong` vs `summingDouble`

| Input/need | Collector | Result type |
|---|---|---|
| Small integer totals | `summingInt()` | `Integer` |
| Large integer totals | `summingLong()` | `Long` |
| Floating-point totals | `summingDouble()` | `Double` |
| Integer statistics | `summarizingInt()` | `IntSummaryStatistics` |
| Large integer statistics | `summarizingLong()` | `LongSummaryStatistics` |
| Floating-point statistics | `summarizingDouble()` | `DoubleSummaryStatistics` |

`IntSummaryStatistics.getSum()` returns a `long`, so it can hold sums beyond the `int` range. However, `Collectors.summingInt()` produces an `Integer` and can overflow.

```java
List<Integer> large = Arrays.asList(Integer.MAX_VALUE, 1);
Integer overflowed = large.stream().collect(Collectors.summingInt(n -> n));
Long safeSum = large.stream().collect(Collectors.summingLong(n -> n));
System.out.println(overflowed); // -2147483648 (overflow)
System.out.println(safeSum);     // 2147483648
```

### Decimal money

Binary floating-point (`double`) can introduce rounding errors. For financial amounts requiring exact decimal arithmetic, prefer `BigDecimal`:

```java
import java.math.BigDecimal;
import java.util.*;

List<BigDecimal> amounts = Arrays.asList(
        new BigDecimal("10.10"),
        new BigDecimal("20.20")
);
BigDecimal total = amounts.stream()
        .reduce(BigDecimal.ZERO, BigDecimal::add);
System.out.println(total); // 30.30
```

### Mapper is not the same as `map()`

```java
// Collector extracts salary directly:
Collectors.summingInt(Employee::getSalary)

// Equivalent approach with a primitive stream:
employees.stream().mapToInt(Employee::getSalary).sum()
```

Both are valid; a collector is particularly useful as a **downstream collector** within `groupingBy()` or `partitioningBy()`.

### Performance and order

- These collectors aggregate values; they do not preserve a meaningful element order in their result.
- `groupingBy()` does not guarantee map key iteration order by default.
- Summarizing once is often clearer than separately computing count, sum, min, max, and average.
- For `averagingInt()`, Java's result is `double`; it is not suitable for exact decimal money.

## 8. Common mistakes

**Mistake 1: Wrong return type**

```java
// Wrong: averagingInt produces Double, not Integer.
// Integer avg = numbers.stream().collect(Collectors.averagingInt(n -> n));
Double avg = numbers.stream().collect(Collectors.averagingInt(n -> n));
```

**Mistake 2: Forgetting to filter before collecting**

```java
Integer evenSum = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.summingInt(n -> n));
```

**Mistake 3: Using min/max on an empty summary without checking count**

```java
if (stats.getCount() > 0) {
    System.out.println(stats.getMin());
}
```

**Mistake 4: Using `summingInt` for totals that may overflow**

Use `summingLong` where appropriate.

**Mistake 5: Assuming `averagingInt` returns an Optional**

It returns `Double`, and an empty stream yields `0.0`.

## 9. Practice problems (basic to advanced)

Try these before looking at the answer key.

1. **Sum salaries:** `[10000,20000,30000,40000]` → `100000`.
2. **Sum odd numbers:** `[10,15,20,25,30,35]` → `75`.
3. **Average marks:** `[60,70,80,90,100]` → `80.0`.
4. **Average even numbers:** `[10,15,20,25,30]` → `20.0`.
5. **Summary:** `[10,20,30,40,50]` → count 5, sum 150, min 10, max 50, average 30.0.
6. **Salary sum after filter:** `[20000,30000,40000,50000,60000]`, only values above 30000 → `150000`.
7. **Average word length:** `["Java","SQL","Spring","AWS"]` → `4.0`.
8. **Total name length:** `["Sai","Ravi","Kumar","John"]` → `16`.
9. **Word-length statistics:** `["Java","SQL","Spring","Docker","AWS"]` → count 5, sum 22, min 3, max 6, average 4.4.
10. **Filter + map + summarize:** `[5,10,15,20,25,30,35,40]`; keep >15, double, summarize → count 5, sum 300, min 40, max 80, average 60.0.
11. **Department totals:** Use the employees in Section 5; calculate totals per department.
12. **Department summaries:** Use `groupingBy` and `summarizingInt` to get count, min, max, and average per department.
13. **Empty stream:** Explain the return values for all three collectors.
14. **Overflow:** Demonstrate why `summingLong` is safer than `summingInt` for very large totals.

## 10. Answer key (Java 8)

The snippets below assume the imports at the top and are placed inside a method.

```java
List<Integer> q1 = Arrays.asList(10000, 20000, 30000, 40000);
System.out.println(q1.stream().collect(Collectors.summingInt(n -> n))); // 100000

List<Integer> q2 = Arrays.asList(10, 15, 20, 25, 30, 35);
System.out.println(q2.stream().filter(n -> n % 2 != 0)
        .collect(Collectors.summingInt(n -> n))); // 75

List<Integer> q3 = Arrays.asList(60, 70, 80, 90, 100);
System.out.println(q3.stream().collect(Collectors.averagingInt(n -> n))); // 80.0

List<Integer> q4 = Arrays.asList(10, 15, 20, 25, 30);
System.out.println(q4.stream().filter(n -> n % 2 == 0)
        .collect(Collectors.averagingInt(n -> n))); // 20.0

List<Integer> q5 = Arrays.asList(10, 20, 30, 40, 50);
IntSummaryStatistics s5 = q5.stream().collect(Collectors.summarizingInt(n -> n));
System.out.println(s5); // count=5, sum=150, min=10, average=30.000000, max=50

List<Integer> q6 = Arrays.asList(20000, 30000, 40000, 50000, 60000);
System.out.println(q6.stream().filter(n -> n > 30000)
        .collect(Collectors.summingInt(n -> n))); // 150000

List<String> q7 = Arrays.asList("Java", "SQL", "Spring", "AWS");
System.out.println(q7.stream().collect(Collectors.averagingInt(String::length))); // 4.0

List<String> q8 = Arrays.asList("Sai", "Ravi", "Kumar", "John");
System.out.println(q8.stream().collect(Collectors.summingInt(String::length))); // 16

List<String> q9 = Arrays.asList("Java", "SQL", "Spring", "Docker", "AWS");
System.out.println(q9.stream().collect(Collectors.summarizingInt(String::length)));
// count=5, sum=22, min=3, average=4.400000, max=6

List<Integer> q10 = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);
IntSummaryStatistics s10 = q10.stream()
        .filter(n -> n > 15)
        .map(n -> n * 2)
        .collect(Collectors.summarizingInt(n -> n));
System.out.println(s10); // count=5, sum=300, min=40, average=60.000000, max=80
```

**Answers 11–12:** See the `groupingBy()` examples in Section 6. **Answers 13–14:** See Sections 4 and 7.

## 11. Interview questions with short answers

**Q1. What does `summingInt()` return?** `Integer`.

**Q2. What does `averagingInt()` return?** `Double`.

**Q3. What does `summarizingInt()` return?** `IntSummaryStatistics`.

**Q4. Which summary statistics are available?** Count, sum, min, max, average.

**Q5. Can you aggregate fields of objects?** Yes; supply a mapper such as `Employee::getSalary`.

**Q6. How do you calculate department totals?** `groupingBy(Employee::getDepartment, summingInt(Employee::getSalary))`.

**Q7. What does `averagingInt()` do on an empty stream?** Returns `0.0`.

**Q8. How should you interpret min/max for an empty `IntSummaryStatistics`?** Check count first; its min/max sentinel values are not real observations.

**Q9. When should you use `summingLong()`?** When the total may exceed the `int` range.

**Q10. What is the difference between `mapToInt(...).sum()` and `summingInt(...)`?** Both can sum mapped integers; `summingInt` also composes naturally as a downstream collector.

**Q11. Can `summarizingInt()` be used with `partitioningBy()`?** Yes, as its downstream collector.

**Q12. Is `double` always appropriate for money?** No; prefer `BigDecimal` for exact decimal arithmetic.

## 12. Revision checklist

- [ ] I can explain the purpose and return type of each collector.
- [ ] I can write sum, average, and summary code without looking up syntax.
- [ ] I can use method references for integer-valued object fields.
- [ ] I can combine these collectors with `filter` and `map`.
- [ ] I can aggregate per department with `groupingBy`.
- [ ] I understand empty-stream results and integer overflow.
- [ ] I can explain when to use `summingLong` or `BigDecimal`.
- [ ] I have solved the practice problems without copying the answers.

---

**Suggested GitHub path:** `Java-8-Stream-API/Collectors/Numeric_Collectors_Basic_to_Advanced.md`

**Next topics:** `mapping()`, `collectingAndThen()`, and `reducing()` as downstream collectors.
