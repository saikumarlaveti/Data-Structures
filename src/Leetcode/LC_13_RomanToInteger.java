package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC_13_RomanToInteger {
    //my code  - failed some test cases;
    public static int romanToInteger(String s) {
        int number = 0;
        boolean isReach=false;
        char[] roman = s.toCharArray();
        Map<Character,Integer> list = new HashMap<>();
        list.put('I', 1);
        list.put('V', 5);
        list.put('X', 10);
        list.put('L', 50);
        list.put('C',100);
        list.put('D',500);
        list.put('M',1000);
        int i = 0;
        while(i<roman.length) {
            System.out.println(i);
            if(i != roman.length-1) {
//case - 1 : I can be placed before V (5) and X (10) to make 4 and 9.
                if(roman[i] == 'I') {
                    if(roman[i+1]=='V') {
                        isReach=true;
                        number += 4;
                        if(i+1 == roman.length-1) {
                            i = roman.length;
                            break;
                        }
                        else{
                            i += 2;
                        }
                    }
                    else if(roman[i+1]=='X') {
                        isReach=true;
                        number += 9;
                        if(i+1 == roman.length-1) {
                            i = roman.length;
                            break;
                        }
                        else{
                            i += 2;
                        }
                    }

                }
 //case - 2 : X can be placed before L (50) and C (100) to make 40 and 90.
                else if (roman[i]=='X') {
                    if(roman[i+1]=='L') {
                        isReach=true;
                        i +=2;
                        number += 40;
                        if(i+1 == roman.length-1) {
                            i = roman.length;
                            break;
                        }
                    }
                    else if(roman[i+1]=='C') {
                        isReach=true;
                        i +=2;
                        number += 90;
                        if(i+1 == roman.length-1) {
                            i = roman.length;
                            break;
                        }
                    }
                }
//case - 3 : C can be placed before D (500) and M (1000) to make 400 and 900.
                else if (roman[i]=='C') {
                    if(roman[i+1]=='D') {
                        isReach=true;
                        number += 400;
                        i += 2;
                        if(i+1 == roman.length-1) {
                            i = roman.length;
                            break;
                        }
                    }
                    else if(roman[i+1]=='M') {
                        isReach=true;
                        i += 2;
                        number += 900;
                        if(i+1 == roman.length-1) {
                            i = roman.length;
                            break;
                        }
                    }
                }
            }
            if(!isReach) {
                number += list.get(roman[i]);
                i++;
            } else if (isReach) {
                isReach = false;
            }

        }
        return number;
    }
    //optimized code
    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                    current < map.get(s.charAt(i + 1))) {

                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        String number = "MCMXCIV";
        System.out.println(romanToInt(number));

        /*
        Symbol       Value
                I             1
                V             5
                X             10
                L             50
                C             100
                D             500
                M             1000
         */

    }
}
