# Java 8 Stream API — Collectors Revision Notes

> GitHub-ready notes covering `toList()`, `toSet()`, `joining()`, `groupingBy()`, and `partitioningBy()`.
>
> **Java version:** Java 8. Use `.collect(Collectors.toList())`, not `.toList()` (added in Java 16).

## 1. Quick reference

| Collector | Purpose | Typical return type |
|---|---|---|
| `Collectors.toList()` | Collect stream elements into a list | `List<T>` |
| `Collectors.toSet()` | Collect unique elements into a set | `Set<T>` |
| `Collectors.joining()` | Combine strings into one string | `String` |
| `Collectors.groupingBy()` | Group elements using a classification key | `Map<K, List<T>>` |
| `Collectors.partitioningBy()` | Split elements into true/false groups | `Map<Boolean, List<T>>` |

### Common imports

```java
import java.util.*;
import java.util.stream.Collectors;
```

---

## 2. `Collectors.toList()`

**Purpose:** Collect stream elements into a `List`. Duplicates are retained, and an ordered sequential stream preserves encounter order.

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

List<Integer> evens = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());

System.out.println(evens); // [10, 20, 30]
```

### Mapping and sorting

```java
List<String> names = Arrays.asList("sai", "ravi", "kumar");

List<String> uppercase = names.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());

System.out.println(uppercase); // [SAI, RAVI, KUMAR]
```

**Remember:** `toList()` does not remove duplicates. `Collectors.toList()` does not guarantee a particular concrete `List` implementation or mutability contract.

---

## 3. `Collectors.toSet()`

**Purpose:** Collect unique elements into a `Set`.

```java
List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20);

Set<Integer> unique = numbers.stream()
    .collect(Collectors.toSet());

System.out.println(unique); // Contains 10, 20, 30 (order not guaranteed)
```

### Filter and remove duplicates

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Sai", "Kumar");

Set<String> result = names.stream()
    .filter(s -> s.length() > 3)
    .collect(Collectors.toSet());

System.out.println(result); // Contains Ravi, Kumar
```

**Remember:** `toSet()` removes duplicates based on `equals()`/`hashCode()`. It does **not** guarantee insertion order. `.distinct()` before `toSet()` is usually unnecessary. For predictable insertion order, use `Collectors.toCollection(LinkedHashSet::new)`.

---

## 4. `Collectors.joining()`

**Purpose:** Join strings into a single `String`.

Three useful forms:

```java
Collectors.joining()                      // No separator
Collectors.joining(", ")                  // Separator
Collectors.joining(", ", "[", "]")       // Separator, prefix, suffix
```

### Examples

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Kumar");

String a = names.stream().collect(Collectors.joining());
String b = names.stream().collect(Collectors.joining(", "));
String c = names.stream().collect(Collectors.joining(" | ", "[", "]"));

System.out.println(a); // SaiRaviKumar
System.out.println(b); // Sai, Ravi, Kumar
System.out.println(c); // [Sai | Ravi | Kumar]
```

### Joining numbers: convert them to strings first

```java
List<Integer> numbers = Arrays.asList(10, 20, 30);

String joined = numbers.stream()
    .map(String::valueOf)
    .collect(Collectors.joining(" - "));

System.out.println(joined); // 10 - 20 - 30
```

**Remember:** `joining()` operates on a stream of `CharSequence` values (commonly strings). Exact separators matter: `","` and `", "` produce different output.

---

## 5. `Collectors.groupingBy()`

**Purpose:** Group elements by a classification key. Unlike partitioning, grouping can produce many categories.

Basic syntax:

```java
stream.collect(Collectors.groupingBy(classifier));
```

Typical return type: `Map<K, List<T>>`.

### Group names by length

```java
List<String> names = Arrays.asList("Sai", "Ravi", "John", "Kumar", "Anil");

Map<Integer, List<String>> byLength = names.stream()
    .collect(Collectors.groupingBy(String::length));

System.out.println(byLength);
// Groups: 3=[Sai], 4=[Ravi, John, Anil], 5=[Kumar]
```

### Group even and odd numbers

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

Map<String, List<Integer>> groups = numbers.stream()
    .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

// Even=[10, 20, 30], Odd=[15, 25]
```

### Count occurrences with a downstream collector

```java
List<String> words = Arrays.asList("Java", "Python", "Java", "SQL", "Java");

Map<String, Long> frequencies = words.stream()
    .collect(Collectors.groupingBy(
        s -> s,
        Collectors.counting()
    ));

// Java=3, Python=1, SQL=1
```

### Group by uppercase initial

```java
List<String> words = Arrays.asList("apple", "ant", "banana", "ball", "cat");

Map<Character, List<String>> byInitial = words.stream()
    .collect(Collectors.groupingBy(
        s -> Character.toUpperCase(s.charAt(0))
    ));

// A=[apple, ant], B=[banana, ball], C=[cat]
```

### Three categories (positive, negative, zero)

```java
List<Integer> values = Arrays.asList(-10, 5, 0, -3, 8, 0);

Map<String, List<Integer>> categories = values.stream()
    .collect(Collectors.groupingBy(
        n -> n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero"
    ));

// Positive=[5, 8], Negative=[-10, -3], Zero=[0, 0]
```

**Remember:** `groupingBy()` map key iteration order is not guaranteed. `Collectors.counting()` returns `Long`, so use `Map<K, Long>`. Empty categories are not automatically created.

---

## 6. `Collectors.partitioningBy()`

**Purpose:** Split a stream into exactly two groups using a predicate (`true` and `false`).

Basic syntax:

```java
stream.collect(Collectors.partitioningBy(predicate));
```

Typical return type: `Map<Boolean, List<T>>`.

### Partition even and odd

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

Map<Boolean, List<Integer>> result = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

System.out.println(result);
// false=[15, 25, 35], true=[10, 20, 30]
```

### Names starting with S

```java
List<String> names = Arrays.asList("Sai", "Ravi", "Santosh", "Kumar", "Suresh");

Map<Boolean, List<String>> result = names.stream()
    .collect(Collectors.partitioningBy(s -> s.startsWith("S")));

// true=[Sai, Santosh, Suresh], false=[Ravi, Kumar]
```

### Partition and count

```java
List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

Map<Boolean, Long> counts = numbers.stream()
    .collect(Collectors.partitioningBy(
        n -> n % 2 == 0,
        Collectors.counting()
    ));

// true=4, false=3
```

### Combine filter, map, and partition

```java
List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);

Map<Boolean, List<Integer>> result = numbers.stream()
    .filter(n -> n > 10)
    .map(n -> n * 2)
    .collect(Collectors.partitioningBy(n -> n > 50));

// true=[60, 70, 80], false=[30, 40, 50]
```

**Remember:** `partitioningBy()` always contains both boolean keys. If no elements match, one list is empty. You can omit the explicit `Collectors.toList()` because it is the default downstream collector.

---

## 7. `groupingBy()` vs `partitioningBy()`

| Feature | `groupingBy()` | `partitioningBy()` |
|---|---|---|
| Input function | Classifier: `T -> K` | Predicate: `T -> boolean` |
| Keys | Any suitable key type | Only `true` and `false` |
| Number of groups | One or more; zero for empty input | Always two boolean entries |
| Typical result | `Map<K, List<T>>` | `Map<Boolean, List<T>>` |
| Count elements | `groupingBy(..., counting())` | `partitioningBy(..., counting())` |
| Example | Group employees by department | Divide employees by salary threshold |

```java
// String keys: "Even" and "Odd"
Map<String, List<Integer>> grouped = numbers.stream()
    .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

// Boolean keys: true and false
Map<Boolean, List<Integer>> partitioned = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
```

---

## 8. Common mistakes and interview tips

1. **Java 8 compatibility:** Use `.collect(Collectors.toList())`; `Stream.toList()` is not available in Java 8.
2. **Ordering:** Neither `toSet()` nor default `groupingBy()` guarantees iteration order of the resulting collection's keys/elements.
3. **Duplicate handling:** `toList()` retains duplicates; `toSet()` removes them.
4. **Separator accuracy:** `joining("-")` differs from `joining(" - ")`.
5. **Correct classification:** `s.startsWith("S")` checks a prefix; `s.length() > 4` checks length.
6. **Zero is neither positive nor negative:** Use a third branch when grouping into positive/negative/zero.
7. **Downstream collectors:** `counting()` changes values from `List<T>` to `Long`.
8. **Partitioning always has two entries:** Both `true` and `false` exist even if one group is empty.
9. **Default list collector:** `groupingBy(classifier)` and `partitioningBy(predicate)` already collect each group into a list.
10. **Java classes:** When grouping custom objects, ensure the classifier returns the intended key, such as `Employee::getDepartment`.

---

## 9. Revision exercises (try without looking above)

**Q1 — `toList()`**: From `[5, 10, 15, 20, 25]`, collect numbers greater than 10 into a list.

**Q2 — `toSet()`**: From `["Java", "SQL", "Java", "AWS", "SQL"]`, collect unique words.

**Q3 — `joining()`**: Join `["Spring", "Boot", "Java"]` into `Spring | Boot | Java`.

**Q4 — `groupingBy()`**: Group `["Sai", "Ravi", "Kumar", "John"]` by string length.

**Q5 — `groupingBy()` + `counting()`**: Count frequencies in `["A", "B", "A", "C", "A", "B"]`.

**Q6 — `partitioningBy()`**: Partition `[1, 2, 3, 4, 5, 6]` into even and odd.

**Q7 — `partitioningBy()` + `counting()`**: Count numbers greater than 20 and not greater than 20 in `[10, 25, 30, 15, 40]`.

**Q8 — Combined pipeline**: Filter values above 10 from `[5, 10, 15, 20, 25]`, double them, and partition by whether the doubled value is greater than 40.

---

## 10. Quick revision checklist

- [ ] I can explain each of the five collectors.
- [ ] I know the return type of each collector.
- [ ] I can use `toList()` and `toSet()` correctly in Java 8.
- [ ] I can join strings with separators, prefixes, and suffixes.
- [ ] I can group by length, first letter, and custom conditions.
- [ ] I can count group members using `Collectors.counting()`.
- [ ] I can explain why `partitioningBy()` has two boolean keys.
- [ ] I can combine `filter()`, `map()`, and collectors.

**Next topic:** `Collectors.toMap()`.
