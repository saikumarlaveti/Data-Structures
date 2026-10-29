# Java 8 Stream API: Collectors — A Beginner-Friendly Complete Guide

**Topics:** `toList()`, `toSet()`, `joining()`, `groupingBy()`, `partitioningBy()`  
**Level:** Beginner → Intermediate  
**Requirements:** Basic Java, `List`, `Set`, `Map`, and lambdas  
**Java version:** Java 8

> **Learning goal:** Even if this is your first time seeing Java Streams, you should be able to explain what each collector does, run the examples, predict the output, and solve the exercises.

## Table of contents

1. [Before we begin: Streams and Collectors](#1-before-we-begin-streams-and-collectors)
2. [`Collectors.toList()`](#2-collectorstolist)
3. [`Collectors.toSet()`](#3-collectorstoset)
4. [`Collectors.joining()`](#4-collectorsjoining)
5. [`Collectors.groupingBy()`](#5-collectorsgroupingby)
6. [`Collectors.partitioningBy()`](#6-collectorspartitioningby)
7. [Comparison and choosing the right collector](#7-comparison-and-choosing-the-right-collector)
8. [Common beginner mistakes](#8-common-beginner-mistakes)
9. [Interview questions with answers](#9-interview-questions-with-answers)
10. [Practice exercises](#10-practice-exercises)
11. [Practice solutions](#11-practice-solutions)
12. [Revision checklist](#12-revision-checklist)

---

## 1. Before we begin: Streams and Collectors

### What is a Stream?

A **Stream** is a way to process a sequence of data using operations such as `filter()`, `map()`, and `sorted()`. A stream is **not** a data structure: it processes data from sources such as lists.

For example, suppose you have marks: `[40, 75, 60, 20]`. You want only marks at least 50.

```java
List<Integer> marks = Arrays.asList(40, 75, 60, 20);
List<Integer> passed = marks.stream()
    .filter(mark -> mark >= 50)
    .collect(Collectors.toList());
System.out.println(passed); // [75, 60]
```

Read this from left to right:

1. `marks.stream()` starts processing the list.
2. `filter(mark -> mark >= 50)` keeps only matching elements.
3. `collect(Collectors.toList())` gathers the results into a new list.

### What does `collect()` do?

`collect()` is a **terminal operation**: it finishes a stream pipeline and produces a result. `Collectors` is a utility class that provides ready-made collection strategies, including the five covered here.

**Analogy:** A stream is a conveyor belt. `filter()` selects items, `map()` transforms items, and `collect()` puts the final items into a basket, set, map, or string.

### Imports and runnable example template

Every example below can be pasted **inside `main()`** in this Java 8 program:

```java
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsPractice {
    public static void main(String[] args) {
        // Paste one example here.
    }
}
```

> **Important:** The `Stream.toList()` shortcut (`stream.toList()`) is not available in Java 8. Use `stream.collect(Collectors.toList())`.

---

## 2. `Collectors.toList()`

### What is it?

`Collectors.toList()` gathers stream elements into a `List`. Use it when you want to **keep the processed elements**, including duplicates, in list form.

**Syntax:**

```java
List<Type> result = source.stream()
    .collect(Collectors.toList());
```

### Example 1: Collect even numbers

**Input:** `[10, 15, 20, 25, 30]`

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
List<Integer> evens = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
System.out.println(evens);
```

**Output:**

```text
[10, 20, 30]
```

**Why?** `n % 2 == 0` is true for even numbers; the collector saves those numbers in a list.

### Example 2: Convert names to uppercase

```java
List<String> names = Arrays.asList("sai", "ravi", "anil");
List<String> uppercaseNames = names.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
System.out.println(uppercaseNames);
```

**Output:** `[SAI, RAVI, ANIL]`

**Key point:** `map()` changes each element; `toList()` collects the changed elements. For an ordered sequential stream like these examples, encounter order is preserved in the result.

### When should you use it?

- You need a list of filtered employees, products, or numbers.
- You want to transform elements and keep them in a list.
- You want to retain duplicates.

---

## 3. `Collectors.toSet()`

### What is it?

`Collectors.toSet()` gathers stream elements into a `Set`. A set does **not allow duplicate elements**.

**Syntax:**

```java
Set<Type> result = source.stream()
    .collect(Collectors.toSet());
```

### Example 1: Remove duplicate numbers

```java
List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20);
Set<Integer> unique = numbers.stream()
    .collect(Collectors.toSet());
System.out.println(unique);
```

**Elements in the result:** `10`, `20`, and `30` (each appears once).

> A regular `Set` returned by `toSet()` has **no guaranteed iteration order**. Your console may show these values in a different order.

### Example 2: Unique departments

```java
List<String> departments = Arrays.asList("IT", "HR", "IT", "Finance", "HR");
Set<String> uniqueDepartments = departments.stream()
    .collect(Collectors.toSet());
System.out.println(uniqueDepartments);
```

**Result:** Contains `IT`, `HR`, and `Finance` once each (order may vary).

### `toList()` versus `toSet()`

| Feature | `toList()` | `toSet()` |
|---|---|---|
| Duplicates | Allowed | Removed |
| Result type | `List<T>` | `Set<T>` |
| Order | Preserves encounter order for ordered streams | No guaranteed iteration order |
| Example use | Employee search results | Unique department names |

**Common question:** Should you write `.distinct().collect(Collectors.toSet())`? Usually not: the set already removes duplicates. You may use `distinct()` if you need it for some earlier stream operation, but it is unnecessary just to get unique set elements.

---

## 4. `Collectors.joining()`

### What is it?

`Collectors.joining()` combines **strings** from a stream into **one string**. This is useful for display text, comma-separated names, labels, and reports.

### Three forms

```java
Collectors.joining()                         // no separator
Collectors.joining(", ")                     // separator
Collectors.joining(", ", "[", "]")           // separator, prefix, suffix
```

### Example 1: Join without a separator

```java
List<String> words = Arrays.asList("Java", "Spring", "SQL");
String result = words.stream().collect(Collectors.joining());
System.out.println(result);
```

**Output:** `JavaSpringSQL`

### Example 2: Join with a comma and space

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Anil");
String result = names.stream().collect(Collectors.joining(", "));
System.out.println(result);
```

**Output:** `Sai, Ravi, Anil`

**Why `", "` rather than `","`?** The first includes a space after each comma; the second produces `Sai,Ravi,Anil`. Separator formatting matters.

### Example 3: Prefix and suffix

```java
List<String> skills = Arrays.asList("Java", "SQL", "Spring Boot");
String result = skills.stream()
    .collect(Collectors.joining(" | ", "Skills: [", "]"));
System.out.println(result);
```

**Output:** `Skills: [Java | SQL | Spring Boot]`

### Example 4: Join integers by converting them to strings

`joining()` expects a stream of strings (more precisely, `CharSequence`), so convert numbers first:

```java
List<Integer> numbers = Arrays.asList(10, 20, 30);
String result = numbers.stream()
    .map(String::valueOf)
    .collect(Collectors.joining(" - "));
System.out.println(result);
```

**Output:** `10 - 20 - 30`

### When should you use it?

Use `joining()` when the desired final output is **one string**, not a `List` or `Set`.

---

## 5. `Collectors.groupingBy()`

### What is it?

`groupingBy()` organizes elements into groups based on a **classification key**. Imagine arranging students into classes or employees into departments.

For example, group names by length:

- Length 3: `Sai`
- Length 4: `Ravi`, `John`, `Anil`
- Length 5: `Kumar`

**Basic syntax:**

```java
Map<KeyType, List<ValueType>> result = source.stream()
    .collect(Collectors.groupingBy(element -> classificationKey));
```

The function `element -> classificationKey` tells Java **which group each element belongs to**.

### Example 1: Group names by length

```java
List<String> names = Arrays.asList("Sai", "Ravi", "John", "Kumar", "Anil");
Map<Integer, List<String>> result = names.stream()
    .collect(Collectors.groupingBy(String::length));
System.out.println(result);
```

**Groups:**

```text
3 -> [Sai]
4 -> [Ravi, John, Anil]
5 -> [Kumar]
```

**Explanation:** The map key is an `Integer` (word length). The map value is a `List<String>` containing the names with that length.

> `groupingBy()` does not guarantee the order in which the map's keys print. The grouped contents matter, not the displayed key order.

### Example 2: Group even and odd numbers

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
Map<String, List<Integer>> result = numbers.stream()
    .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
System.out.println(result);
```

**Groups:**

```text
Even -> [10, 20, 30]
Odd  -> [15, 25]
```

The ternary expression returns the text key `Even` or `Odd`.

### Example 3: Group names by first letter

```java
List<String> names = Arrays.asList("Sai", "Santosh", "Ravi", "Ramesh");
Map<Character, List<String>> result = names.stream()
    .collect(Collectors.groupingBy(s -> s.charAt(0)));
System.out.println(result);
```

**Groups:** `S -> [Sai, Santosh]` and `R -> [Ravi, Ramesh]`.

**Caution:** `charAt(0)` requires a nonempty string. For real data that might contain empty names, filter them out first.

### Example 4: Count how often each word appears

Sometimes you want a **count** rather than a list. Use a **downstream collector**:

```java
List<String> words = Arrays.asList("Java", "Python", "Java", "SQL", "Java");
Map<String, Long> counts = words.stream()
    .collect(Collectors.groupingBy(
        word -> word,
        Collectors.counting()
    ));
System.out.println(counts);
```

**Groups:** `Java -> 3`, `Python -> 1`, `SQL -> 1`.

**Why `Long`?** `Collectors.counting()` produces a `Long`, so the result is `Map<String, Long>` instead of `Map<String, Integer>`.

### Example 5: Group positive, negative, and zero

```java
List<Integer> numbers = Arrays.asList(-5, 0, 10, -15, 20, 0);
Map<String, List<Integer>> result = numbers.stream()
    .collect(Collectors.groupingBy(
        n -> n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero"
    ));
System.out.println(result);
```

**Groups:**

```text
Positive -> [10, 20]
Negative -> [-5, -15]
Zero     -> [0, 0]
```

**Important:** Checking only `n > 0 ? "Positive" : "Negative"` would incorrectly put zero into the negative group.

### What is a downstream collector?

The second argument controls **what happens inside each group**:

```java
Collectors.groupingBy(String::length)                       // groups into lists
Collectors.groupingBy(String::length, Collectors.counting()) // counts per group
```

Use the first for `Map<Integer, List<String>>` and the second for `Map<Integer, Long>`.

---

## 6. `Collectors.partitioningBy()`

### What is it?

`partitioningBy()` divides elements into **exactly two groups**, based on a true/false condition called a **predicate**.

- Key `true`: elements that pass the condition.
- Key `false`: elements that fail the condition.

**Syntax:**

```java
Map<Boolean, List<Type>> result = source.stream()
    .collect(Collectors.partitioningBy(element -> condition));
```

### Example 1: Even versus odd

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
Map<Boolean, List<Integer>> result = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
System.out.println(result);
```

**Output:**

```text
{false=[15, 25], true=[10, 20, 30]}
```

### Example 2: Names starting with S

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Santosh", "Kumar", "Suresh");
Map<Boolean, List<String>> result = names.stream()
    .collect(Collectors.partitioningBy(name -> name.startsWith("S")));
System.out.println(result);
```

**Groups:**

```text
true  -> [Sai, Santosh, Suresh]
false -> [Ravi, Kumar]
```

**Important distinction:** `name.startsWith("S")` checks the beginning of the name. `name.length() > 4` checks its length. Always match the condition to the question.

### Example 3: Count each partition

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
Map<Boolean, Long> counts = numbers.stream()
    .collect(Collectors.partitioningBy(
        n -> n % 2 == 0,
        Collectors.counting()
    ));
System.out.println(counts);
```

**Output:** `{false=3, true=4}`.

### Example 4: Combine `filter()`, `map()`, and `partitioningBy()`

```java
List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);
Map<Boolean, List<Integer>> result = numbers.stream()
    .filter(n -> n > 10)
    .map(n -> n * 2)
    .collect(Collectors.partitioningBy(n -> n > 50));
System.out.println(result);
```

**Step-by-step:**

| Step | Values |
|---|---|
| Original | `[5, 10, 15, 20, 25, 30, 35, 40]` |
| After filter > 10 | `[15, 20, 25, 30, 35, 40]` |
| After multiplying by 2 | `[30, 40, 50, 60, 70, 80]` |
| `false` (not > 50) | `[30, 40, 50]` |
| `true` (> 50) | `[60, 70, 80]` |

### Example 5: What if one partition is empty?

```java
List<Integer> numbers = Arrays.asList(2, 4, 6);
Map<Boolean, List<Integer>> result = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
System.out.println(result);
```

**Output:** `{false=[], true=[2, 4, 6]}`.

Unlike basic `groupingBy()` behavior, `partitioningBy()` includes **both** boolean keys, even if one group is empty.

---

## 7. Comparison and choosing the right collector

| Desired result | Collector | Typical type |
|---|---|---|
| A list of filtered items | `toList()` | `List<T>` |
| Unique values | `toSet()` | `Set<T>` |
| One formatted string | `joining()` | `String` |
| Groups such as departments or lengths | `groupingBy()` | `Map<K, List<T>>` |
| Exactly two groups, pass/fail | `partitioningBy()` | `Map<Boolean, List<T>>` |

### `groupingBy()` versus `partitioningBy()`

```java
// Descriptive keys: "Even" and "Odd"
Map<String, List<Integer>> grouped = numbers.stream()
    .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

// Boolean keys: true and false
Map<Boolean, List<Integer>> partitioned = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
```

**Rule of thumb:** If your condition is naturally yes/no, consider `partitioningBy()`. If you need labels, many categories, or different key types, consider `groupingBy()`.

---

## 8. Common beginner mistakes

1. **Using `.toList()` in Java 8.** Write `.collect(Collectors.toList())` instead.
2. **Assuming a set is sorted.** `Collectors.toSet()` removes duplicates but does not promise order.
3. **Missing spaces in joining separators.** `joining(",")` differs from `joining(", ")`.
4. **Using `joining()` on integers directly.** Convert first with `.map(String::valueOf)`.
5. **Using the wrong grouping condition.** `startsWith("S")` is not the same as `length() > 4`.
6. **Forgetting the zero case.** Positive/negative/zero requires three categories.
7. **Using `Integer` for `counting()`.** Its result type is `Long`.
8. **Expecting map key order.** Standard `groupingBy()` does not guarantee the order of keys.
9. **Expecting `partitioningBy()` to return string labels.** Its keys are `Boolean`.
10. **Forgetting that streams are single-use.** After a terminal operation such as `collect()`, create a new stream to process the source again.

---

## 9. Interview questions with answers

**Q1. What is `collect()`?**  
A terminal stream operation that gathers processed elements into a result using a collector.

**Q2. What is the difference between `toList()` and `toSet()`?**  
A list allows duplicates; a set contains unique elements.

**Q3. Does `Collectors.toSet()` guarantee insertion order?**  
No.

**Q4. How do you join names with ` | `?**  
`names.stream().collect(Collectors.joining(" | "))`.

**Q5. Can you use `joining()` with integers?**  
Yes, after converting them to strings, for example with `.map(String::valueOf)`.

**Q6. What is the basic return type of `groupingBy()`?**  
`Map<K, List<T>>`, where `K` is the classifier key type.

**Q7. How can you count items in each group?**  
Use `groupingBy(classifier, Collectors.counting())`.

**Q8. Why does `counting()` use `Long`?**  
Because its collector result is a `Long` count.

**Q9. Can `partitioningBy()` create three groups?**  
No. It always uses the two boolean keys `true` and `false`.

**Q10. What happens if all items pass the partition condition?**  
The `true` list contains all items and the `false` list is empty; both keys are present.

**Q11. Can `groupingBy()` create three or more groups?**  
Yes, if the classifier returns three or more different keys.

**Q12. Does `collect()` modify the original list?**  
These examples create new results and do not change the source list.

---

## 10. Practice exercises

Try these **without looking at the solutions**. Write each solution inside the `main()` template from Section 1.

**P1 — `toList()`:** From `[4, 9, 12, 15, 20]`, collect numbers greater than 10. Expected: `[12, 15, 20]`.

**P2 — `toList()`:** From `["java", "sql", "spring"]`, collect uppercase versions. Expected: `[JAVA, SQL, SPRING]`.

**P3 — `toSet()`:** From `["IT", "HR", "IT", "QA", "HR"]`, collect unique departments. Expected elements: `IT`, `HR`, `QA`.

**P4 — `joining()`:** Join `["Java", "Spring", "MySQL"]` with `" | "`. Expected: `Java | Spring | MySQL`.

**P5 — `joining()`:** Join `[1, 2, 3]` with commas and spaces. Expected: `1, 2, 3`.

**P6 — `groupingBy()`:** Group `["Sai", "Ravi", "Anil", "Kumar"]` by string length. Expected groups: `3 -> [Sai]`, `4 -> [Ravi, Anil]`, `5 -> [Kumar]`.

**P7 — `groupingBy()` with counting:** Count frequencies in `["Java", "SQL", "Java", "Java", "SQL"]`. Expected: `Java -> 3`, `SQL -> 2`.

**P8 — `groupingBy()`:** Group `[-2, 0, 3, -1, 0, 5]` into `Positive`, `Negative`, and `Zero`.

**P9 — `partitioningBy()`:** Partition `[10, 15, 20, 25]` into even (`true`) and odd (`false`).

**P10 — `partitioningBy()` with counting:** Count how many numbers in `[5, 10, 15, 20, 25]` are greater than 12. Expected: `true -> 3`, `false -> 2`.

---

## 11. Practice solutions

> These are Java 8 expressions. Use the imports and `main()` method from Section 1.

### P1

```java
List<Integer> data = Arrays.asList(4, 9, 12, 15, 20);
List<Integer> result = data.stream().filter(n -> n > 10)
    .collect(Collectors.toList());
System.out.println(result); // [12, 15, 20]
```

### P2

```java
List<String> data = Arrays.asList("java", "sql", "spring");
List<String> result = data.stream().map(String::toUpperCase)
    .collect(Collectors.toList());
System.out.println(result); // [JAVA, SQL, SPRING]
```

### P3

```java
List<String> data = Arrays.asList("IT", "HR", "IT", "QA", "HR");
Set<String> result = data.stream().collect(Collectors.toSet());
System.out.println(result); // IT, HR, QA in unspecified order
```

### P4

```java
List<String> data = Arrays.asList("Java", "Spring", "MySQL");
String result = data.stream().collect(Collectors.joining(" | "));
System.out.println(result); // Java | Spring | MySQL
```

### P5

```java
List<Integer> data = Arrays.asList(1, 2, 3);
String result = data.stream().map(String::valueOf)
    .collect(Collectors.joining(", "));
System.out.println(result); // 1, 2, 3
```

### P6

```java
List<String> data = Arrays.asList("Sai", "Ravi", "Anil", "Kumar");
Map<Integer, List<String>> result = data.stream()
    .collect(Collectors.groupingBy(String::length));
System.out.println(result);
```

### P7

```java
List<String> data = Arrays.asList("Java", "SQL", "Java", "Java", "SQL");
Map<String, Long> result = data.stream()
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println(result);
```

### P8

```java
List<Integer> data = Arrays.asList(-2, 0, 3, -1, 0, 5);
Map<String, List<Integer>> result = data.stream()
    .collect(Collectors.groupingBy(
        n -> n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero"));
System.out.println(result);
```

### P9

```java
List<Integer> data = Arrays.asList(10, 15, 20, 25);
Map<Boolean, List<Integer>> result = data.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
System.out.println(result); // {false=[15, 25], true=[10, 20]}
```

### P10

```java
List<Integer> data = Arrays.asList(5, 10, 15, 20, 25);
Map<Boolean, Long> result = data.stream()
    .collect(Collectors.partitioningBy(n -> n > 12, Collectors.counting()));
System.out.println(result); // {false=2, true=3}
```

---

## 12. Revision checklist

- [ ] I can explain what a Stream and `collect()` do.
- [ ] I know when to use `toList()` versus `toSet()`.
- [ ] I remember that `toSet()` does not guarantee order.
- [ ] I can use all three forms of `joining()`.
- [ ] I can convert numbers to strings before joining.
- [ ] I can group by length, first letter, and category.
- [ ] I can count groups using `Collectors.counting()`.
- [ ] I can distinguish `groupingBy()` from `partitioningBy()`.
- [ ] I can combine `filter()`, `map()`, and a collector.
- [ ] I have solved the practice questions without viewing the solutions.

### Suggested GitHub repository layout

```text
Java-8-Stream-API/
├── README.md
└── Collectors/
    └── java8_collectors_student_guide.md
```

**Next learning topic:** `Collectors.toMap()` — creating maps, selecting keys and values, and handling duplicate keys.

---

*Keep learning by running and changing each example. Predict the output first, then verify it in Eclipse.*
