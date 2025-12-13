package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LC_1941_EqualNumberOfOccurrences {
    public static boolean areOccurrencesEqual(String s) {

        // step - 1 : Create Hash Map key : Character and Value : Integer
    Map<Character,Integer> occurrence = new HashMap<>();

    // step - 2 : convert the String into character Array
    char[] c= s.toCharArray();

    //step - 3 : Iterative the character array
    for(int i = 0;i<c.length;i++){
        // step - 4 : if key is found then increment the value
        if(occurrence.containsKey(c[i])){
            //step - 5 : get the value based on key
         int res =  occurrence.get(c[i]);
            // step - 6: increment the value
         occurrence.put(c[i],++res);
        }
        //step - 7: else add into the map
        else {
        occurrence.put(c[i],1);
    }}
    // print
        System.out.println(occurrence);
    //comparing
        // step - 8 : Taking first value then compare to the through the hashmap
        int result  = occurrence.get(c[0]);
        System.out.println(result);
// iteration
        Set<Character> d = occurrence.keySet();
        boolean bool = true;
        for(Character e :d){
            if(occurrence.get(e) != result){
                bool = false;
            }

        }
        return bool;
    }
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc")); // true
        System.out.println(areOccurrencesEqual("aaabb"));  // false
        System.out.println(areOccurrencesEqual("tveixwaeoezcf")); //false
    }
}
