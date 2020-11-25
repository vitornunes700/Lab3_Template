package pt.pa.model;

import java.util.List;

public class HigherGrade implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty()){return -1;}
        double g = grades.iterator().next().getGrade();
        for(StudentGrade s : grades){
            if(s.getGrade() > g){
                g = s.getGrade();
            }
        }
        return g;
    }
}
