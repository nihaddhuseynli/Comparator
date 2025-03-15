import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 90.5, new Date(2000, 1, 15), "Female"));
        students.add(new Student(2, "Bob", 85.0, new Date(1999, 5, 20), "Male"));
        students.add(new Student(3, "Charlie", 90.5, new Date(2001, 3, 10), "Male"));

        Collections.sort(students);
        System.out.println("Sorted by ID:");
        students.forEach(System.out::println);

        Collections.sort(students, (s1, s2) -> {
            int gradeCompare = Double.compare(s2.getGrade(), s1.getGrade());
            if (gradeCompare != 0) return gradeCompare;

            int birthdateCompare = s1.getBirthdate().compareTo(s2.getBirthdate());
            if (birthdateCompare != 0) return birthdateCompare;

            return s2.getGender().compareTo(s1.getGender());
        });
        System.out.println("\nSorted by Grade (descending), Birthdate (ascending), and Gender (descending):");
        students.forEach(System.out::println);
    }
}
