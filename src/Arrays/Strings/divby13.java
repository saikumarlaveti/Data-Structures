package Arrays.Strings;

public class divby13 {
    public static boolean divby13(String s){
        int remainder = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % 13;
        }
        return remainder == 0;
    }
    public static void main(String[] args) {
        System.out.println(divby13("46465396726998134418"));
    }
}
