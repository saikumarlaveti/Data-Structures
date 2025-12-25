package RevisionTopics.String;

public class ConstantString {
    public static void main(String[] args) {

        //case -1
        String s1  = "Saikumar";
        String s2 = new String ("Saikumar");
        System.out.println(s1 == s2);

        //case -2

        StringBuffer s3  = new StringBuffer("Saikumar");
        StringBuilder s4 = new StringBuilder("Saikumar");
        System.out.println(s3.equals(s4));
    }
}
