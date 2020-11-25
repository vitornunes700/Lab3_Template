package pt.pa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortName implements GradeSorting {
    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade s1, StudentGrade s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
    }
}
