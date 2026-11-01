package LeetcodeConcepts.SlidingWindow.Fixed_Size;

public class CountOccurrencesOfAnagrams_05 {
    public static int CountOccurrence(String name, String pattern,int k){
        int count = 0;
        boolean flag ;
        for(int i = 0; i<=name.length()- k; i++){
            flag = true;
                String result = name.substring(i, k +i);
            System.out.println(result);
                for(int l = 0;l<k;l++){
                    if(result.charAt(k-l-1) != pattern.charAt(l)){
                        flag = false;
                        break;
                    }

            }
            if(flag){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String name = "cbaebabacd";
        String pattern = "abc";
        System.out.println(CountOccurrence(name,pattern,3));

    }
}
