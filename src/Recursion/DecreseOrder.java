package Recursion;

public class DecreseOrder {
    public void printDecre(int n)
    {
        if(n==0)
            return ;
        else {
            System.out.print(n+" ");
            printDecre((n-1));
        }

    }
    public static void main(String[] args) {
        DecreseOrder ro = new DecreseOrder();
        ro.printDecre(10);
    }
}
