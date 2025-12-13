package List.Stack.Array;

public class stackArray {
    int maxSize;
    int[] stack;
    int top;

stackArray(int Size)
{
    stack = new int[Size];
    maxSize = Size;
    top = -1;
}

    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else {
        stack[++top] = data;
            System.out.println(data + " pushed to the stack");
        }
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else {
           top--;
        }
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("The top element is "+stack[top]);
        }
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return (top == maxSize-1);
    }

    public void display()
    {
        for(int i =0;i<=top;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        stackArray sta = new stackArray(5);
        sta.push(1);
        sta.push(2);
        sta.display();
        sta.peek();
        sta.display();
    }
}
