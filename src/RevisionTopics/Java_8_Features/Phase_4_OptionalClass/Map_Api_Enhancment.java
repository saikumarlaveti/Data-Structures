package RevisionTopics.Java_8_Features.Phase_4_OptionalClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 80);

// Version 1 — replace if key exists
        scores.replace("Alice", 95);
        System.out.println(scores);  // {Alice=95, Bob=80}

        scores.replace("Charlie", 100);  // key doesn't exist — no effect
        System.out.println(scores);      // {Alice=95, Bob=80}

// Version 2 — conditional replace
        boolean updated = scores.replace("Bob", 80, 85);  // only if Bob == 80
        System.out.println(updated);  // true
        System.out.println(scores);   // {Alice=95, Bob=85}

        boolean updated2 = scores.replace("Bob", 80, 90);  // Bob is now 85, not 80
        System.out.println(updated2); // false — no change
  //      5. replaceAll()
  //      6. compute()
  //      7. computeIfAbsent()
   //     8. computeIfPresent()
  //      9. merge()






    }
}
