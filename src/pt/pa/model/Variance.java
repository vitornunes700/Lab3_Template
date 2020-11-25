package pt.pa.model;

import java.util.List;

import static java.lang.StrictMath.pow;

public class Variance implements Statistic{
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades.isEmpty()){return -1;}
        double ne = 0;
        ArithmeticAverage aa = new ArithmeticAverage();
        double aa2 = aa.compute(grades);
        for(StudentGrade g : grades){
            //ne += (g.getGrade() - aa2)*(g.getGrade() + aa2);
            ne += pow(g.getGrade() - aa2 ,2);
        }

        return ne/grades.size();
    }
}
