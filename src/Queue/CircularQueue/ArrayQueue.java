package Queue.CircularQueue;

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
        else{
            arr[currentIndex++] = n;
            rear = rear+1;
        }
    }

    public boolean isEmpty(){
        return front==-1;
    }



    public static void main(String[] args) {

    }
}
