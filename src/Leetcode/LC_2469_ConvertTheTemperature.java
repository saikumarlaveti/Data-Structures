package Leetcode;

import java.util.Arrays;

public class LC_2469_ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[0] = celsius+273.15;
        arr[1] = celsius*1.80+32.00;
        return arr;
    }

    /* Optimize Solution from LeetCode
    public double[] convertTemperature(double celsius) {
        return new double[]{
            celsius + 273.15,
            celsius * 1.80 + 32.00
        };
    }
     */
    public static void main(String[] args) {
        Arrays.stream(convertTemperature(36.50)).forEach(i->System.out.print(i+" "));
    }
}
