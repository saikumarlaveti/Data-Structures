package Leetcode;

public class LC_2278_PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
            int count = 0;
            for(int i = 0;i<s.length();i++){

                if(s.charAt(i) == letter){
                    count++;
                }
            }
            int len = s.length();
          return (int) (((double) count / len)*100);
        }

        public static void main(String[] args) {
          LC_2278_PercentageOfLetterInString pol = new LC_2278_PercentageOfLetterInString();
            String word = "foobar";
            System.out.println(pol.percentageLetter(word,'o'));
            word.length();
        }
    }

