package RevisionTopics.String;


public class Reserse {
    public void approach1(String name){
        StringBuilder revname = new StringBuilder(" ");
        for(int i = name.length()-1;i>=0;i--){
            revname.append(name.charAt(i));
        }
        System.out.println(revname);
    }

    public void approach2(String name){
        StringBuilder reversed =new StringBuilder(name);
        reversed.reverse();
        System.out.println(reversed);
    }
    public void approach3(String name) {
    char[] ch = name.toCharArray();
    StringBuilder reverse = new StringBuilder("");
    for(int i = ch.length-1;i>=0;i--){
        reverse.append(name.charAt(i));
    }
        System.out.println(reverse);
    }
        public static void main(String[] args) {
        Reserse re = new Reserse();
        String name = "Saikumar";
        re.approach1(name);
        re.approach2(name);
        re.approach3(name);

    }
}
