package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortGrade implements GradeSorting {
    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade g1, StudentGrade g2) {
                return g1.getGrade() - (g2.getGrade());
            }
        });
    }
}
