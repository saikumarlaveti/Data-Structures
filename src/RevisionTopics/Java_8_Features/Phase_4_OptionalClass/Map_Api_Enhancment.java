package RevisionTopics.Java_8_Features.Phase_4_OptionalClass;

import java.util.*;

public class Map_Api_Enhancment {
    public static void main(String[] args) {
        //Before java 8
        List<String> frequent = Arrays.asList("Saikumar","Santosh","Naresh","Saikumar","Santosh");
        Map<String,Integer> count = new HashMap<>();
        for(String word:frequent){
            if(count.containsKey(word)){
                count.put(word,count.get(word)+1);
            }else{
                count.put(word,1);
            }
        }
        System.out.println(count);    // {Saikumar=2, Naresh=1, Santosh=2}

        Map<String,Integer> wordCount = new HashMap<>();
        for(String i :frequent){
            wordCount.merge(i,1,Integer::sum);  // {Saikumar=2, Naresh=1, Santosh=2}
        }
        System.out.println(wordCount);
        /*===============================================================================================*/
   //     1. getOrDefault()
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 28);
        ages.put("Bob", 35);

        System.out.println(ages.getOrDefault("Alice", 0));    // 28
        System.out.println(ages.getOrDefault("Charlie", 0));   // 0 (not present)

   //     2. putIfAbsent()
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.putIfAbsent("Alice", 100);  // Alice exists — NOT overwritten
        scores.putIfAbsent("Bob", 80);     // Bob doesn't exist — inserted
        System.out.println(scores);  // {Alice=90, Bob=80}
  //      3. forEach()
        Map<String, Integer> age = new HashMap<>();
        ages.put("Alice", 28);
        ages.put("Bob", 35);

        ages.forEach((name, agee) -> System.out.println(name + " is " + agee + " years old"));
// Alice is 28 years old
// Bob is 35 years old
  //      4. replace()
        Map<String, Integer> scores1 = new HashMap<>();
        scores1.put("Alice", 90);
        scores1.put("Bob", 80);

// Version 1 — replace if key exists
        scores1.replace("Alice", 95);
        System.out.println(scores1);  // {Alice=95, Bob=80}

        scores1.replace("Charlie", 100);  // key doesn't exist — no effect
        System.out.println(scores1);      // {Alice=95, Bob=80}

// Version 2 — conditional replace
        boolean updated = scores1.replace("Bob", 80, 85);  // only if Bob == 80
        System.out.println(updated);  // true
        System.out.println(scores1);   // {Alice=95, Bob=85}

        boolean updated2 = scores1.replace("Bob", 80, 90);  // Bob is now 85, not 80
        System.out.println(updated2); // false — no change
  //      5. replaceAll()
            Map<String,Integer> names = new HashMap<>();
            names.put("Saikumar",10);
            names.put("Santosh",20);

            names.replaceAll((a,b)->b+5);
            System.out.println(names);  // {Saikumar=15, Santosh=25}

        // Using key in transformation
        Map<String, String> greetings = new HashMap<>();
        greetings.put("Alice", "Hi");
        greetings.put("Bob", "Hello");

        greetings.replaceAll((name, greeting) -> greeting + ", " + name + "!");
        System.out.println(greetings);
// {Alice=Hi, Alice!, Bob=Hello, Bob!}

  //      6. compute()
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 80);

// Update existing — increment by 10
        marks.compute("Alice", (key, value) -> value + 10);
        System.out.println(marks);  // {Alice=90}

// Key doesn't exist — value passed to function is null
        marks.compute("Bob", (key, value) -> (value == null) ? 50 : value + 10);
        System.out.println(marks);  // {Alice=90, Bob=50}

// Returning null removes the entry
        marks.compute("Alice", (key, value) -> null);
        System.out.println(marks);  // {Bob=50}

  //      7. computeIfAbsent()
        Map<String, List<String>> groups = new HashMap<>();

// Key absent — creates new ArrayList and adds element
        groups.computeIfAbsent("fruits", k -> new ArrayList<>()).add("Apple");
        groups.computeIfAbsent("fruits", k -> new ArrayList<>()).add("Banana");

// Key already exists — reuses same list, doesn't recreate
        groups.computeIfAbsent("vegetables", k -> new ArrayList<>()).add("Carrot");
        System.out.println(groups);   // {fruits=[Apple, Banana], vegetables=[Carrot]}
        groups.computeIfAbsent("fruits",k->new ArrayList<>()).add("Saikumar");
        System.out.println(groups);  //  {fruits=[Apple, Banana, Saikumar], vegetables=[Carrot]}


   //     8. computeIfPresent()
  //      9. merge()






    }
}
