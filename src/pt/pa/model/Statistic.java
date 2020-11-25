package pt.pa.model;

import java.util.List;

public interface Statistic {
    double compute(List<StudentGrade> grades);
}
