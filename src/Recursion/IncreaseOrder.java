package Recursion;

public class IncreaseOrder {
    public void printIncrease(int n)
    {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        else {

            printIncrease(n-1);
            System.out.print(n+" ");

        }
    }
    public static void main(String[] args) {
        IncreaseOrder io = new IncreaseOrder();
        io.printIncrease(10);

    }
}
