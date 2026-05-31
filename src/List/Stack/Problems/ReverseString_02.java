package List.Stack.Problems;

import java.nio.channels.Channel;
import java.util.Stack;

public class ReverseString_02 {
    public  void reverseString(String name){
        if(name.isEmpty() || name.length() == 1){
            return;
        }
        else{
            Stack<Character> reverse = new Stack<>();
            for(int i = 0;i<name.length();i++){
                reverse.push(name.charAt(i));
            }
            while(!reverse.isEmpty()){
                System.out.print(reverse.pop() + " ");
            }

        }
    }
    public static void main(String[] args) {
        String name = "Saikumar";
        ReverseString_02 reverse = new ReverseString_02();
        reverse.reverseString(name);
    }
}
