package LeetcodeConcepts.Hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isValidAnagram(String s1 , String s2){
        if(s1.length()  != s2.length()) return false;
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i = 0;i<s1.length();i++) {
            char ch = s1.charAt(i);
//            if(result.containsKey(ch)){
//                int val = result.get(ch);
//                result.put(ch,++val);
//            }
//            else
//                result.put(ch,1);
//        }
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        System.out.println(result);
        for(int i = 0;i<s2.length();i++) {
            char ch = s2.charAt(i);
            if (result.get(ch) != null) {
                if (result.get(ch) == 1) {
                    result.remove(ch);
                } else {
                    result.put(ch, result.get(ch) - 1);
                }
            }
        }
        return result.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValidAnagram("sai","ias"));
        System.out.println(isValidAnagram("saikumar","ramukias"));
        System.out.println(isValidAnagram("people","polepa"));
    }
}
