package RevisionTopics.GarbageCollection;

import java.awt.*;
import java.util.Date;

public class RunnerDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory :"+r.totalMemory());
        System.out.println("Free Memory :"+ r.totalMemory());
        for(int i =1;i<=100000;i++){
            Date d = new Date();
            d = null;
        }
        System.out.println("Total Memory :"+r.totalMemory());

        System.gc();
        System.out.println("Free Memory :"+r.freeMemory());

    }
}
