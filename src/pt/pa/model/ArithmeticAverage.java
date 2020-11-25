package pt.pa.model;

import java.util.List;

public class ArithmeticAverage implements Statistic{

    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty()){return -1;}

        double m = 0;
        for(StudentGrade g : grades){
            m += g.getGrade();
        }
        return m/grades.size();
    }
}
