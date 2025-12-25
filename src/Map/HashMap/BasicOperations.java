package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasicOperations {
    HashMap<Integer,String> map = new HashMap<>();

    //1.Add Operation
    public void addElements(){
        System.out.println("Add Elements :: put Method");
        map.put(1," Java ");
        map.put(2," Python  ");
        map.put(3," C++ ");
        map.put(4," Data Science ");
        map.put(5," SQL ");
        System.out.println(map);
    }
    //2. Iterate over entrySet() (Key + Value) – Most Common

    public void IterationMethods_1() {
        System.out.println("-----------------------------------");
        System.out.println("Iteration Over :: entrySet() Method :: 1");
        for (Map.Entry<Integer, String> it : map.entrySet()){
            System.out.println(it.getKey() + " : " + it.getValue());
        }

    }
//only keys
    public void IterationMethods_OnlyKeys() {
        System.out.println("-----------------------------------");
        System.out.println("Only Keys");
        for (Integer key : map.keySet()){
            System.out.println(key);
   //         System.out.println("key " + key + "  value  " + map.get(key));
        }
    }

    //only values
    public void IterationMethods_OnlyValues() {
        System.out.println("-----------------------------------");
        System.out.println("Only Values");
        for (String values : map.values()){
            System.out.println(values);
        }
    }

    //forEach Method
    public void forEachMethod() {
        System.out.println("-----------------------------------");
        map.forEach((key, value) -> {
            System.out.println("key : " + key + " value : " + value);
        });
    }

    //Iterator
    public void Iterator(){
        System.out.println("-----------------------------------");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }

    public static void main(String[] args) {
    BasicOperations bo = new BasicOperations();
    bo.addElements();
    bo.IterationMethods_1();
    bo.IterationMethods_OnlyKeys();
    bo.IterationMethods_OnlyValues();
    bo.forEachMethod();
    bo.Iterator();

    }

}

