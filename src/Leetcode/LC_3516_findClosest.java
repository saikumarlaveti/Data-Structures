package Leetcode;

public class LC_3516_findClosest {
    public int findClosest(int x, int y, int z) {
        int person1 = Math.abs(z-x);
        int person2 = Math.abs(z-y);

        if(person1 == person2)
            return 0;
        else if(person1<person2)
            return 1;
        else
            return 2;
    }
}

//https://leetcode.com/problems/find-closest-person/submissions/1667458185
