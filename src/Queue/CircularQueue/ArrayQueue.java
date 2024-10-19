package Queue.CircularQueue;

public class ArrayQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    ArrayQueue(int n){
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public boolean isFull(){
        return (rear + 1) % size == front;
    }

    public void enque(int data){
        if(isFull()) {
            System.out.println("Queue is full");
            return; // Fix: Don't proceed if the queue is full
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int deque() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];

        // Check if this is the last element
        if(rear == front) {
            rear = front = -1; // Queue is now empty
        } else {
            front = (front + 1) % size;
        }

        return result;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while(i != rear){
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(arr[rear]); // Print the last element
    }

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(3);
        aq.enque(1);
        aq.enque(2);
        aq.enque(3);
        aq.display();
        System.out.println("Removed element is " + aq.deque());
        aq.display();
    }
}
