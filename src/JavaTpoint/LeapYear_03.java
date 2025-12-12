package JavaTpoint;

import java.util.ArrayList;

public class LeapYear_03 {
    public static void leapYear(int start_Year, int end_Year){
        ArrayList<Integer> leapYear = new ArrayList<>();
        ArrayList<Integer>nonLeapYear = new ArrayList<>();
        for(int i = start_Year;i<=end_Year;i++){
            if(i %400 == 0)
                leapYear.add(i);
            else if (i % 100 == 0)
                nonLeapYear.add(i);
            else if(i %4 == 0)
                    leapYear.add(i);
            else
                nonLeapYear.add(i);
            }

        System.out.println(leapYear);
        System.out.println(nonLeapYear);
        }

    public static void main(String[] args) {
        leapYear(2000,2026);

    }
}
