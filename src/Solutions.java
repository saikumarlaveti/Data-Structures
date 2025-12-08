class Solutions {
    public boolean isPalindrome(String s) {
        String remove = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) ==' ' || s.charAt(i) == ':' || s.charAt(i) == ','){
                continue;
            }
            else{
                remove += s.charAt(i);
            }
        }
        String reverse = "";

        for(int i = s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
        }

        return remove.equals(reverse);
    }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        System.out.println( s.isPalindrome("Saikumar"));
        System.out.println(s.isPalindrome("SAS"));
    }
}