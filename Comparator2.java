import java.util.Comparator;

public class Comparator2 implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeCompare = Double.compare(s2.getGrade(), s1.getGrade());
        if (gradeCompare != 0) {
            return gradeCompare;
        }

        int birthdateCompare = s1.getBirthdate().compareTo(s2.getBirthdate());
        if (birthdateCompare != 0) {
            return birthdateCompare;
        }

        return s2.getGender().compareTo(s1.getGender());
    }
}