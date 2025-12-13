package LeetcodeConcepts.Stack;

import java.util.ArrayList;

public class StackOperationsUsingArrayList {
    static ArrayList<Integer> number = new ArrayList<>();
    //1.push
    public static void insertOperations(int a ){
        number.add(a);
    }
    //2.pop
    public static int removeOperation(){
       return number.removeLast();
    }
    //3.print
    public static void print(){
        System.out.println(number);
    }
    //4.isEmpty()
    public static boolean isEmpty(){
        return number.isEmpty();
    }
    //5.peek()
    public static int peek(){
        if(isEmpty()){
                return -1; }
        return number.get(number.size()-1);
    }
    //6.search()
    public static String search(int element){
        if(isEmpty()){
            return "LeetcodeConcepts.Stack is Empty";
        }
        for(int i = 0;i<number.size();i++){
            if(element == number.get(i)){
                return "found";
            }

        }return "Not found";
    }
    public static void main(String[] args) {
        insertOperations(1);insertOperations(2);insertOperations(3);insertOperations(4);insertOperations(5);insertOperations(6);
        print();
        System.out.println("pop () " +removeOperation());
        print();
        System.out.println("isEmpty "+isEmpty());
        print();
        System.out.println("peek() "+ peek());
        print();
        System.out.println("Search " + search(2));
        System.out.println("Search " + search(5));
        System.out.println("search- "+ search(50));

    }
}
