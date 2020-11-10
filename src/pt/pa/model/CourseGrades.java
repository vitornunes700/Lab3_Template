package pt.pa.model;

import java.util.*;

public class CourseGrades {
    private final String course;
    private Map<String, StudentGrade> results;

    public CourseGrades(String course) {
        this.course = course;
        results = new HashMap<>();
    }

    public boolean exists(String studentId) {
        return results.containsKey(studentId);
    }

    public StudentGrade get(String studentId) throws CourseGradesException {
        StudentGrade studentGrade = results.get(studentId);
        /* If student doesn't exist, null is returned */
        return studentGrade;
    }

    public void add(StudentGrade g) throws CourseGradesException, NullPointerException {
        if(g == null)
            throw new NullPointerException("StudentGrade cannot be null.");

        if(results.containsKey(g.getId()))
            throw new CourseGradesException("Student already exists.");

        results.put(g.getId(), g);
    }

    public StudentGrade remove(String studentId)  {
        StudentGrade studentGrade = results.remove(studentId);
        /* If student doesn't exist, null is returned */
        return studentGrade;
    }

    public int update(String studentId, int newGrade) throws CourseGradesException {
        if(newGrade < 0 || newGrade > 20) throw new CourseGradesException("Grade must be in [0,20].");
        if(!exists(studentId))
            throw new CourseGradesException("Student does not exist: " + studentId);

        StudentGrade studentGrade = results.get(studentId);
        int oldGrade = studentGrade.updateGrade(newGrade);
        return oldGrade;
    }

    public Collection<StudentGrade> list() {
        List<StudentGrade> list = new ArrayList<>( results.values() );
        list.sort((g1, g2) -> g1.getName().compareToIgnoreCase(g2.getName()));
        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.course + "\n");

        for(StudentGrade g : list()) {
            sb.append( String.format("%10s | %-30s | %2d\n",
                    g.getId(), g.getName(), g.getGrade()));
        }

        return sb.toString();
    }
}
