# Predicate — Java 8 (Basic to Advanced)

> **Learning track:** 01 Functional Programming  
> **Prerequisites:** Java syntax, variables, methods and collections.  
> **Compatibility:** Java 8.  
> **Learning goal:** Explain, implement and interview confidently on **Predicate**.

## 1. Why learn this?

test, and, or, negate. This feature is useful when writing clear Java backend code and processing collections safely.

**Think about it:** Rather than memorizing a method name, identify the input type, the transformation or condition, and the expected output type. That makes it easier to choose the right Java API.

## 2. Key idea and mental model

**Predicate**: test, and, or, negate.

- **Input:** A value, collection, stream, or functional-interface instance depending on the operation.
- **Operation:** Apply the relevant function or collector.
- **Output:** The resulting value, collection, map, optional, or side effect.
- **Java 8 rule:** Use Java 8 APIs such as `Collectors.toList()` rather than the Java 16 `Stream.toList()` method.

## 3. Complete runnable example

Save as `LessonExample.java` and run in Eclipse or with `javac LessonExample.java && java LessonExample`.

```java
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LessonExample {
    public static void main(String[] args) {
        Predicate<Integer> positive = n -> n > 0;
        System.out.println(positive.and(n -> n % 2 == 0).test(8));
    }
}
```

**Expected output** (map/set iteration order and parallel execution order can vary):

```text
true
```

## 4. Step-by-step explanation

1. Identify the data source and its element type.
2. Read the lambda or method reference from left to right.
3. Identify whether the operation is intermediate, terminal, or a collector (when applicable).
4. Follow each element through the operation and verify the result type.
5. Test edge cases: empty input, duplicates, nulls, ordering and large inputs.

## 5. Intermediate application

Adapt the example to a backend scenario: employee IDs, department names, salary values, or API DTO fields. First write the expected output on paper, then implement it with Java 8. Prefer meaningful variable names and small, testable functions.

## 6. Advanced notes and pitfalls

Predicate<T> returns boolean; compose conditions safely.

Also consider these engineering questions:

- **Null handling:** Do input elements or extracted properties need validation?
- **Ordering:** Is output order guaranteed by the source and operation?
- **Complexity:** Does this approach scan, sort, allocate or duplicate data?
- **Concurrency:** Does this operation mutate shared state or depend on execution order?
- **Testing:** What should happen for an empty collection or duplicate values?

## 7. Common mistakes

1. Confusing the *element type* with the *result type*.
2. Assuming all stream operations execute immediately (intermediate operations are lazy).
3. Reusing a consumed stream (streams cannot be reused after a terminal operation).
4. Assuming a `HashMap` or `HashSet` preserves insertion order.
5. Using Java APIs introduced after Java 8 when targeting Java 8.

Not every mistake applies to every snippet; use this checklist to inspect your own solution.

## 8. Practice exercises

**Basic:** Modify the input values and predict the output before running the program.

**Intermediate:** Rework the example to process a list of employees, products, or marks while preserving the same concept.

**Advanced:** Add an empty-input test, a duplicate-input test and a null-input policy. Explain how ordering, performance and thread safety affect the result.

**Challenge:** Implement a second approach using a loop or another Java 8 API. Compare clarity, result type and runtime characteristics.

## 9. Interview questions and answer guidance

**Q1. What problem does Predicate solve?**  
A. test, and, or, negate.

**Q2. What is the input and output type?**  
A. Inspect the functional interface or stream pipeline in Section 3; state the exact generic or primitive type.

**Q3. What are common mistakes?**  
A. Explain the relevant pitfalls in Sections 6 and 7, with an example.

**Q4. When would you avoid this approach?**  
A. When it reduces clarity, introduces unnecessary allocations, violates thread safety or complicates required ordering.

**Q5. How would you test it?**  
A. Verify normal input, empty input, duplicates, boundaries, and expected exceptions.

## 10. Revision checklist

- [ ] I can explain this topic in simple English.
- [ ] I can type and run the example without copying.
- [ ] I can predict the output before running it.
- [ ] I understand the result type and edge cases.
- [ ] I can answer the interview questions.
- [ ] I completed the basic, intermediate and advanced exercises.

---

[Back to repository index](../README.md)
