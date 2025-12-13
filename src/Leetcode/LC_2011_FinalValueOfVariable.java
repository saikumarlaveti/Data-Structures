package Leetcode;

public class LC_2011_FinalValueOfVariable {
    public static int finalValueAfterOperations(String[] operations) {
        int var = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--"))
                var--;
            else if(operations[i].equals("++X") || operations[i].equals("X++"))
                var++;
        }
        return var;
    }

    public static int finalValueAfterOperations1(String[] operations) {
     int val = 0;
     for(String s :operations){
         if(s.contains("+"))
             val++;
         else
             val--;
     }
     return val;
    }

    public static void main(String[] args) {
        String[] name  = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(name));
        System.out.println(finalValueAfterOperations1(name));
    }
}
