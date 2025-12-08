//class Solution{
//    public String removeSpaces(String name){
//        //StringBuffer word  = new StringBuffer();
//        String word = "";
//        for(int i = 0;i<name.length();i++){
//            if(name.charAt(i) == ' ' || name.charAt(i) == ',' || name.charAt(i) == ':'){
//                continue;
//            }
//            else {
//                //word.append(name.charAt(i));
//                word += name.charAt(i);
//            }
//        }
//        return word;
//    }
//    public boolean pal(String name){
//        name = name.toLowerCase();
//        String word = removeSpaces(name);
//        String original = word;
//        String reverese = "";
//        for(int i = word.length()-1;i>=0;i--){
//                    reverese += word.charAt(i);
//                }
//        System.out.println(word);
//        System.out.println(reverese);
//        return original.equals(reverese);
//    }
//    public static void main(String[] args) {
//      //  String name = "A man, a plan, a canal: Panama";
//        String name = "Saiku   ma,r";
//        Solution s = new Solution();
//        System.out.println(s.pal(name));
//
//    }
//}
class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
        String remove = "";
        for(int i = 0;i<s.length();i++){
            if(s.matches("[a-zA-Z]")){
                remove += s.charAt(i);
            }
            else {
                continue;
            }
//            if(s.charAt(i) <='z' || s.charAt(i) >='a'){
//                remove += s.charAt(i);
//            }
//            else{
//                continue;
//            }
        }
        String reverse = "";

        for(int i = remove.length()-1;i>=0;i--){
            reverse += remove.charAt(i);
        }
        System.out.println(remove);
        System.out.println(reverse);
        return remove.equals(reverse);
    }
        public static void main(String[] args) {
            // String name = "A man, a plan, a canal: Panama";
        //String name = "Saiku   ma,r";
        Solution s = new Solution();
        String name = "race a car";
        System.out.println(s.isPalindrome(name));

    }
}
