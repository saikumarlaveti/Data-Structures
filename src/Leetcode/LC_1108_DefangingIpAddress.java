package Leetcode;

public class LC_1108_DefangingIpAddress {
    public static String defangIPaddr(String address) {
        StringBuilder name = new StringBuilder();
        for(int i = 0;i<address.length();i++){
            if(address.charAt(i) !='.')
                name.append(address.charAt(i));
            else if (address.charAt(i) =='.')
                name.append("[.]");
        }
        return name.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1")); //1[.]1[.]1[.]1
    }
}
