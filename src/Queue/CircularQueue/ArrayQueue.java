package Queue.CircularQueue;

import java.util.Arrays;

public class ArrayQueue {
    public int front;
    public int rear;
    public int currentIndex = 0;
    public int size;
    int arr[];
    //create an array
    ArrayQueue(int length){
        arr = new int[length];
         front = -1;
         rear = -1;
         size = length;
    }

    //enqueue
    public void enqueue(int n){
        if(front == -1 ){
            front = 0;
        }

            arr[currentIndex++] = n;
            rear = rear+1;

    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        else{
            int temp = arr[front];
            front += 1;
            return temp;
        }

    }

    public boolean isEmpty(){
        return front == -1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else {
            return arr[front];
        }
        return -1;
    }
    public void displayQueue(){
        for(int i = front;i<=rear;i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.displayQueue();
        System.out.println(queue.isEmpty());

        System.out.println("dequeue");
        System.out.println(queue.dequeue());
        queue.displayQueue();

        System.out.println("peek");
        System.out.println(queue.peek());


    }
}
