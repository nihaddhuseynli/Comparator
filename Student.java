import java.util.Date;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;
    private Date birthdate;
    private String gender;

    public Student(int id, String name, double grade, Date birthdate, String gender) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", birthdate=" + birthdate +
                ", gender='" + gender + '\'' +
                '}';
    }
}