import java.time.LocalTime;

class Solution{
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        System.out.println(hour);

    }
}