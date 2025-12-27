package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LC_500_KeyboardRow {

    public static String[] findWords(String[] words) {
        String firstLine = "qwertyuiop";
        String secondLine = "asdfghjkl";
        String thirdLine = "zxcvbnm";
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            String Originalword = words[i];
            String Lowerword = Originalword.toLowerCase();
                char ch = Lowerword.charAt(0);
                String ch1 = String.valueOf(ch);
                boolean flag = true;
                if(firstLine.contains(ch1)){
                    for(int k = 0;k<Lowerword.length();k++){
                        if(!firstLine.contains(String.valueOf(Lowerword.charAt(k)))) {
                            flag = false;
                            break;
                        }
                    }

                } //firstLine
                else if(secondLine.contains(ch1)){
                    for(int l = 0; l <Lowerword.length(); l++){
                        if(!secondLine.contains(String.valueOf(Lowerword.charAt(l)))) {
                            flag = false;
                            break;
                        }
                    }

                } //secondLine
                else{
                    for(int m = 0; m <Lowerword.length(); m++){
                        if(!thirdLine.contains(String.valueOf(Lowerword.charAt(m)))){
                            flag = false;
                            break;
                    }
                    }
                } //ThirdLine
            if(flag)
                result.add(Originalword);
        }//for end
        // Copying ArrayList to String Array
        String[] resultarr = new String[result.size()];
        int temp = 0;
        for(String i : result)
            resultarr[temp++] = i;
        return resultarr;
    }
    public static void main(String[] args) {
       String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));  // [Alaska, Dad]

       }
}
