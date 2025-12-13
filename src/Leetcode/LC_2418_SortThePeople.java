package Leetcode;

import java.util.*;

public class LC_2418_SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> result = new TreeMap<>();
        for(int i = 0;i<names.length;i++){
            result.put(heights[i],names[i] );
        }

        NavigableMap<Integer, String> order = result.descendingMap();
        int i = 0;
        for (Map.Entry<Integer, String> entry : order.entrySet()) {
           names[i++]  = entry.getValue();
        }
        System.out.println(Arrays.toString(names));
        return names;
    }

    public static void main(String[] args) {
        String [] name = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        sortPeople(name,heights);
        // Excepted Output : [Mary, Emma, John]
    }
}


