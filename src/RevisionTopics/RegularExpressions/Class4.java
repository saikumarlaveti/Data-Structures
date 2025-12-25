package RevisionTopics.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class4 {
    public static void main(String[] args) {
        Pattern  p = Pattern.compile("\\d");
        Matcher m = p.matcher("saikumar143");
        while(m.find()){
            System.out.println(m.start()+" ..... "+m.end()+" ..... "+m.group());
        }
    }
}
