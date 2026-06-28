package RevisionTopics.String;

public class ConstantString {
    public static void main(String[] args) {

        //case -1
        String s1  = "LC_13_RomanToInteger";
        String s2 = new String ("LC_13_RomanToInteger");
        System.out.println(s1 == s2);

        //case -2

        StringBuffer s3  = new StringBuffer("LC_13_RomanToInteger");
        StringBuilder s4 = new StringBuilder("LC_13_RomanToInteger");
        System.out.println(s3.equals(s4));
    }
}
