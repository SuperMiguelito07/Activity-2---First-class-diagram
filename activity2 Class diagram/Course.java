package activity2_classdiagram;
import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.students = new ArrayList<>();
    }
    public int countStudents() {
        return students.size();
    }
}   