package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.ComparableVsComparator.Comparator;

import java.util.Collections;
import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.age - emp2.age;
    }
}
