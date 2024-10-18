package Queue.SimpleQueue.Array;

public class Queue {
    static int[] arr;
    static int rear = -1;
    static int front = 0;
    static int size;

    public Queue(int max)
    {
        arr = new int[max];
        size = max-1;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return rear == size;
    }
    //PUSH OR ENQUE
    public void add(int data)
    {
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            arr[++rear] = data;
        }
    }
    //POP OR DEQUE
    public void delete()
    {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            front++;
        }
    }
    public int peek()
    {
        return arr[0];
    }
    public void display(){
        for(int i = front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.add(5);
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        q.display();
        q.add(4);
        q.add(84);
        q.add(45);
        q.add(93);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
       q.display();
       q.delete();
        System.out.println(q.isFull());
        q.display();
        System.out.println();
        System.out.println(q.peek());

    }
}
