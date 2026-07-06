package Queue.ArrayDeque;

import java.util.Arrays;

public class Operations {
    public int[] arr;
    int currentIndex = -1;

    //create Queue
    public void createQueue(int length){
        arr = new int[length];
    }

    //pushing Enque
    public String Enque(int element){
        if(currentIndex>arr.length){
            return "Queue is Full " ;
        }
        arr[++currentIndex] = element;
        return "Element successfully Inserted";
    }

    //print Queue
    public void displayQueue(){
        System.out.println(Arrays.toString(arr));
    }

    //removing Element
    public String deque(int element){
        if(currentIndex<arr.length){
            ++currentIndex;
        }
        return "Element successfully removed";
    }




}
