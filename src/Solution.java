import java.util.Stack;

class Solution{

    public static boolean validparentheses(String s){
        Stack<Character> stack = new Stack<>();
        if(s.isEmpty()){
            return false;
        }
        else{
            char[] ch = s.toCharArray();
            for(int  i = 0;i<ch.length;i++){
                char c = ch[i];
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    if(c=='}' || c==']' || c==')' ){
                        
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s = "{[()]}";
    }
}