package Leetcode;

import java.util.*;

public class LC_819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {

        // Step 1: Convert paragraph to lowercase
        paragraph = paragraph.toLowerCase();

        // Step 2: Replace punctuation with space
        paragraph = paragraph.replaceAll("[^a-z ]", " ");

        // Step 3: Split into words
        String[] words = paragraph.split("\\s+");

        // Step 4: Store banned words in a set
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b.toLowerCase());
        }

        // Step 5: Count frequency of non-banned words
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        // Step 6: Find the most frequent word
        String result = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] res = {"hello"};
   //     mostCommonWord("sai kumar laveti laveti",res);
    }
}
