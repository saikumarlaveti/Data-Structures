package LeetcodeConcepts.TwoPointers;

public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            while(left<right && vowels.indexOf(arr[left]) == -1){
                left++;
            }
            while(left<right && vowels.indexOf(arr[right]) == -1){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}
