package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumber implements GradeSorting{
    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade n1, StudentGrade n2) {
                return n1.getId().compareToIgnoreCase(n2.getId());
            }
        });
    }
}
