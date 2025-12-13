package JavaTpoint;

public  class FibonacciSeries_01 {
    public static void for_Fibonacci(int a ,int b , int limit){
        System.out.print(a + " " + b + " ");
        for(int i = 1 ;i<=limit;i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void while_Fibonacci(int a ,int b , int limit){
        System.out.print(a + " " + b + " ");
        int i = 1;
        while(i <= limit ){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }

    public static void do_Fibonacci(int a ,int b , int limit){
        System.out.print(a + " " + b + " ");
        int i = 1;
        do{
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }while(i <= limit );
    }

    public static void recursion_Fibonacci(int a ,int b , int limit){
        if(limit  <= 0){
            return;
        }
        int c = a + b;
        System.out.print(" " + c);
        recursion_Fibonacci(b,c,--limit);
    }

  //  solve in java 8

    public static void main(String[] args) {
        for_Fibonacci(0,1,10);
        System.out.println();
        while_Fibonacci(0,1,10);
        System.out.println();
        do_Fibonacci(0,1,10);
        System.out.println();
        System.out.println("LeetcodeConcepts.Recursion :");
        System.out.print("0"  + " 1");
        recursion_Fibonacci(0,1,10);
    }
}
