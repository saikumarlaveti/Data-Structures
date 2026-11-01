# Java 8 Stream API — `Collectors.toMap()` Complete Student Guide

> **Audience:** Beginners learning Java 8 and developers preparing for backend interviews.  
> **Prerequisites:** Java collections (`List`, `Map`), lambda expressions, and basic Stream API.  
> **Compatibility:** All code uses Java 8.

## 1. Learning objectives

By the end of this guide, you should be able to:

- Convert a stream into a `Map<K,V>`.
- Choose keys and values with mapper functions.
- Use `Function.identity()` and method references.
- Diagnose and resolve duplicate-key errors with merge functions.
- Preserve insertion order when necessary.
- Combine `filter()`, `map()`, and `toMap()`.
- Explain the difference between `toMap()` and `groupingBy()`.

## 2. What is `Collectors.toMap()`?

`Collectors.toMap()` is a terminal-operation collector used with `Stream.collect()` to create a `Map` from stream elements. A map stores **one value per unique key**.

Example: names become keys, and name lengths become values.

| Input name | Map key | Map value |
|---|---|---|
| Sai | `Sai` | `3` |
| Ravi | `Ravi` | `4` |
| Kumar | `Kumar` | `5` |

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Kumar");
Map<String, Integer> lengths = names.stream()
    .collect(Collectors.toMap(name -> name, name -> name.length()));
System.out.println(lengths);
```

**Possible output:** `{Ravi=4, Kumar=5, Sai=3}`. Map iteration order is **not guaranteed** by the default collector.

## 3. Syntax and parameters

```java
Collectors.toMap(keyMapper, valueMapper)
Collectors.toMap(keyMapper, valueMapper, mergeFunction)
Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)
```

- **`keyMapper`**: a `Function<T,K>` that selects the key for each stream element.
- **`valueMapper`**: a `Function<T,V>` that selects the value.
- **`mergeFunction`**: a `BinaryOperator<V>` that resolves duplicate keys.
- **`mapSupplier`**: chooses a concrete map implementation, such as `LinkedHashMap::new`.

A typical result is `Map<String, Integer>` or `Map<Integer, Employee>`.

### Runnable starter program

Paste the following into a file named `ToMapDemo.java`:

```java
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sai", "Ravi", "Kumar");
        Map<String, Integer> result = names.stream()
            .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(result);
    }
}
```

Each later snippet can be placed inside `main` with the imports above.

## 4. Core examples

### Example A — Number to square

```java
List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
Map<Integer, Integer> squares = numbers.stream()
    .collect(Collectors.toMap(n -> n, n -> n * n));
System.out.println(squares);
```

**Entries:** `2=4`, `3=9`, `4=16`, `5=25`, `6=36` (order may vary).

**Common mistake:** `n * 2` doubles a number; `n * n` squares it.

### Example B — Name to uppercase name

```java
List<String> names = Arrays.asList("sai", "ravi", "kumar");
Map<String, String> upper = names.stream()
    .collect(Collectors.toMap(n -> n, String::toUpperCase));
```

**Entries:** `sai=SAI`, `ravi=RAVI`, `kumar=KUMAR`.

### Example C — Word to first character

```java
List<String> words = Arrays.asList("Java", "Python", "SQL", "Docker");
Map<String, Character> initials = words.stream()
    .collect(Collectors.toMap(w -> w, w -> w.charAt(0)));
```

**Entries:** `Java=J`, `Python=P`, `SQL=S`, `Docker=D`.

**Caution:** `charAt(0)` throws `StringIndexOutOfBoundsException` for an empty string. Filter empty strings if the input may contain them.

### Example D — Number to even/odd label

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
Map<Integer, String> labels = numbers.stream()
    .collect(Collectors.toMap(n -> n, n -> n % 2 == 0 ? "Even" : "Odd"));
```

**Entries:** `10=Even`, `15=Odd`, `20=Even`, `25=Odd`, `30=Even`.

### Example E — `Function.identity()`

`Function.identity()` returns the input unchanged, so it is equivalent to `x -> x`.

```java
List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
Map<String, Integer> lengths = fruits.stream()
    .collect(Collectors.toMap(Function.identity(), String::length));
```

**Entries:** `Apple=5`, `Banana=6`, `Mango=5`.

## 5. Duplicate keys: the most important interview topic

The two-argument overload **throws `IllegalStateException`** when two elements produce the same key, even when their mapped values are equal.

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Sai");
Map<String, Integer> result = names.stream()
    .collect(Collectors.toMap(n -> n, String::length));
// Throws IllegalStateException: duplicate key "Sai"
```

A map cannot hold two entries under the same key. Supply a **merge function** to choose what happens:

```java
Map<String, Integer> result = names.stream()
    .collect(Collectors.toMap(
        Function.identity(),
        String::length,
        (oldValue, newValue) -> oldValue
    ));
```

**Entries:** `Sai=3`, `Ravi=4`.

| Merge function | Meaning |
|---|---|
| `(oldValue, newValue) -> oldValue` | Keep existing value |
| `(oldValue, newValue) -> newValue` | Keep incoming value |
| `(oldValue, newValue) -> oldValue + newValue` | Add values |
| `Integer::sum` | Add integer values using method reference |

The merge function receives the existing and incoming **values**, not the keys.

### Count word frequencies with a merge function

```java
List<String> words = Arrays.asList("Java", "SQL", "Java", "Python", "SQL", "Java");
Map<String, Integer> counts = words.stream()
    .collect(Collectors.toMap(
        Function.identity(),
        word -> 1,
        Integer::sum
    ));
```

**Entries:** `Java=3`, `SQL=2`, `Python=1`.

Step by step: each word contributes `1`; when a key repeats, `Integer::sum` adds the previous count and the new `1`.

### Duplicate *derived* keys: group by length, keep first word

```java
List<String> names = Arrays.asList("Sai", "Ram", "Ravi", "John", "Kumar");
Map<Integer, String> firstForLength = names.stream()
    .collect(Collectors.toMap(
        String::length,
        Function.identity(),
        (first, next) -> first
    ));
```

**Entries:** `3=Sai`, `4=Ravi`, `5=Kumar`.

`Sai` and `Ram` both have key `3`; `Ravi` and `John` both have key `4`. For this sequential, ordered stream, the merge retains the first encountered word.

## 6. Preserve insertion order with `LinkedHashMap`

The default `toMap()` does **not** promise insertion order. If order matters, use the four-argument overload:

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Kumar");
Map<String, Integer> ordered = names.stream()
    .collect(Collectors.toMap(
        Function.identity(),
        String::length,
        (first, second) -> first,
        LinkedHashMap::new
    ));
System.out.println(ordered);
```

**Output:** `{Sai=3, Ravi=4, Kumar=5}`.

`LinkedHashMap` preserves insertion order. This can matter for predictable reports or presentation.

## 7. Backend example — Employee ID to employee name

Use a unique employee ID as a key so you can look up the associated name.

```java
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMapExample {
    static class Employee {
        private final int id;
        private final String name;

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        int getId() { return id; }
        String getName() { return name; }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Sai"),
            new Employee(102, "Ravi"),
            new Employee(103, "Kumar")
        );

        Map<Integer, String> namesById = employees.stream()
            .collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(namesById.get(102)); // Ravi
    }
}
```

**Production note:** Decide how duplicate IDs should be handled; do not silently discard duplicates unless that behavior is intended.

## 8. Combining `filter()`, `map()`, and `toMap()`

**Problem:** From `[5, 10, 15, 20, 25, 30]`, retain numbers greater than 10, double them, and create a map of doubled number to its square.

```java
List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
Map<Integer, Integer> result = numbers.stream()
    .filter(n -> n > 10)
    .map(n -> n * 2)
    .collect(Collectors.toMap(n -> n, n -> n * n));
```

| Stage | Result |
|---|---|
| Input | `[5, 10, 15, 20, 25, 30]` |
| Filter `n > 10` | `[15, 20, 25, 30]` |
| Double | `[30, 40, 50, 60]` |
| Map entries | `30=900`, `40=1600`, `50=2500`, `60=3600` |

## 9. `toMap()` vs `groupingBy()`

| Topic | `toMap()` | `groupingBy()` |
|---|---|---|
| Main use | Build key-value pairs | Group by classifier |
| Default values | One mapped value per key | List of elements per key |
| Duplicate keys | Throws without merge function | Collects elements into groups |
| Typical result | `Map<Integer, String>` | `Map<Integer, List<String>>` |
| Example | Employee ID → name | Department → employees |

Use `toMap()` when each key should map to **one chosen or combined value**. Use `groupingBy()` when each key should hold a **group of matching elements**.

## 10. Common mistakes and how to fix them

1. **Accidentally doubling instead of squaring:** write `n * n`, not `n * 2`.
2. **Duplicate-key exception:** supply a merge function, or reconsider whether `groupingBy()` is more appropriate.
3. **Assuming a fixed output order:** use the four-argument overload with `LinkedHashMap::new` when required.
4. **Using Java 16+ `.toList()` in Java 8 code:** use `.collect(Collectors.toList())` instead (when collecting a list).
5. **Using `String::length` as a key without checking duplicates:** multiple words may share the same length.
6. **Nulls:** do not rely on `toMap()` accepting null mapped values; filter or replace nulls before collecting.
7. **Wrong types:** verify whether your result should be `Map<String,Integer>`, `Map<Integer,String>`, etc.

## 11. Practice exercises

Try these before looking at the solutions.

1. **Q1:** `"Sai", "Ravi", "Kumar", "John"` → name to length.
2. **Q2:** `2, 3, 4, 5, 6` → number to square.
3. **Q3:** `"sai", "ravi", "kumar"` → original name to uppercase name.
4. **Q4:** `"Java", "Python", "SQL", "Docker"` → word to first character.
5. **Q5:** `10, 15, 20, 25, 30` → number to `"Even"`/`"Odd"`.
6. **Q6:** `"Sai", "Ravi", "Sai", "Kumar"` → name to length, keeping first value on duplicates.
7. **Q7:** `"Java", "SQL", "Java", "Python", "SQL", "Java"` → word frequency using `Integer::sum`.
8. **Q8:** `"Apple", "Banana", "Mango"` → name to length using `Function.identity()`.
9. **Q9:** `"Sai", "Ram", "Ravi", "John", "Kumar"` → length to first word of that length.
10. **Q10:** `5, 10, 15, 20, 25, 30` → filter `>10`, double, then map doubled number to its square.

### Solutions

These snippets assume `import java.util.*;`, `import java.util.function.Function;`, and `import java.util.stream.Collectors;`.

```java
// Q1
Map<String, Integer> q1 = Arrays.asList("Sai", "Ravi", "Kumar", "John")
    .stream().collect(Collectors.toMap(Function.identity(), String::length));

// Q2
Map<Integer, Integer> q2 = Arrays.asList(2, 3, 4, 5, 6)
    .stream().collect(Collectors.toMap(n -> n, n -> n * n));

// Q3
Map<String, String> q3 = Arrays.asList("sai", "ravi", "kumar")
    .stream().collect(Collectors.toMap(Function.identity(), String::toUpperCase));

// Q4
Map<String, Character> q4 = Arrays.asList("Java", "Python", "SQL", "Docker")
    .stream().collect(Collectors.toMap(Function.identity(), w -> w.charAt(0)));

// Q5
Map<Integer, String> q5 = Arrays.asList(10, 15, 20, 25, 30)
    .stream().collect(Collectors.toMap(n -> n, n -> n % 2 == 0 ? "Even" : "Odd"));

// Q6
Map<String, Integer> q6 = Arrays.asList("Sai", "Ravi", "Sai", "Kumar")
    .stream().collect(Collectors.toMap(Function.identity(), String::length,
        (oldValue, newValue) -> oldValue));

// Q7
Map<String, Integer> q7 = Arrays.asList("Java", "SQL", "Java", "Python", "SQL", "Java")
    .stream().collect(Collectors.toMap(Function.identity(), w -> 1, Integer::sum));

// Q8
Map<String, Integer> q8 = Arrays.asList("Apple", "Banana", "Mango")
    .stream().collect(Collectors.toMap(Function.identity(), String::length));

// Q9
Map<Integer, String> q9 = Arrays.asList("Sai", "Ram", "Ravi", "John", "Kumar")
    .stream().collect(Collectors.toMap(String::length, Function.identity(),
        (first, next) -> first));

// Q10
Map<Integer, Integer> q10 = Arrays.asList(5, 10, 15, 20, 25, 30)
    .stream().filter(n -> n > 10).map(n -> n * 2)
    .collect(Collectors.toMap(n -> n, n -> n * n));
```

## 12. Interview questions with answers

**Q: What does `Collectors.toMap()` do?**  
A: It collects stream elements into a map using functions to determine keys and values.

**Q: What happens with duplicate keys?**  
A: The two-argument overload throws `IllegalStateException`. A merge function can resolve collisions.

**Q: What does `Function.identity()` do?**  
A: Returns the input unchanged; equivalent to `x -> x`.

**Q: What is a merge function?**  
A: A function that chooses or combines values when the same key appears again.

**Q: Can `toMap()` count duplicate words?**  
A: Yes: `toMap(Function.identity(), w -> 1, Integer::sum)`.

**Q: Is the map insertion order guaranteed?**  
A: Not with the default collector. Supply `LinkedHashMap::new` as the fourth argument if required.

**Q: When should I use `groupingBy()` instead?**  
A: When you want multiple stream elements collected under each classification key.

**Q: What are the types of the first two arguments?**  
A: Conceptually `Function<T,K>` and `Function<T,V>`.

## 13. Quick revision checklist

- [ ] I can explain `keyMapper` and `valueMapper`.
- [ ] I can write a basic two-argument `toMap()`.
- [ ] I know why duplicate keys throw an exception.
- [ ] I can use a merge function to keep first, keep last, or sum.
- [ ] I can use `Function.identity()` and method references.
- [ ] I can preserve insertion order with `LinkedHashMap::new`.
- [ ] I can combine `filter()`, `map()`, and `toMap()`.
- [ ] I can explain `toMap()` vs `groupingBy()`.

---

**Suggested repository location:** `Java-8-Stream-API/Collectors/Collectors_toMap.md`  
**Next lesson:** `Collectors.summingInt()`, `averagingInt()`, and `summarizingInt()`.
