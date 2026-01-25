package DataStructureClasses;

public class Class_14 {
    //old approach
    public static void factorial(int n){
        int total = 1;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                total++;
            }
        }
        System.out.println(total);
    }

    // best approach
    public static void factorial_1(int n){
        int total = 0;
        for(int i = 1;i*i<= n;i++){
            if(n%i == 0){
              if(n/i == i){
                  total++;
              }
              else{
                  total +=2;
              }
            }
        }
        System.out.println("total " + total);
    }
    public static void main(String[] args) {
        int n = 100;
        factorial(n);
        factorial_1(n);
    }
}
