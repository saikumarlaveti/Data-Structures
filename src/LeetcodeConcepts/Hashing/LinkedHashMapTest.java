package LeetcodeConcepts.Hashing;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {
    LinkedHashMap<Integer,String> colors = new LinkedHashMap<>();

    //1. Insertion
    public void insertElements(Integer key , String color){
        colors.put(key,color);
    }

    //2.get
    public void getElement(Integer key ){
        String value =  colors.get(key);
        System.out.println(value);
    }
    //3.remove
    public void remove(Integer key){
        System.out.println(colors.remove(key));
    }
    //4.iteration
    public void iteration(){
        Set<Integer> res = colors.keySet();

        for(Integer s :res){
            System.out.println(s + " : " + colors.get(s));
        }
    }

    public int lengthOfTheLinkedHashMap(){
        return colors.size();
    }

    public boolean isEmpty(){
        return  colors.isEmpty();
    }
    public static void main(String[] args) {
    LinkedHashMapTest lht = new LinkedHashMapTest();
    lht.insertElements(1,"Black");
    lht.insertElements(20,"Green");
    lht.insertElements(3,"Red");

    lht.iteration();
        System.out.println(lht.isEmpty());
        System.out.println(lht.lengthOfTheLinkedHashMap());
        lht.getElement(3);
        lht.remove(3);
    }
}
