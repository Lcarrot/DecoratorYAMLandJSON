import java.io.Serializable;
import java.util.ArrayList;

public class StudentsList implements Serializable {
    ArrayList<Student> students = new ArrayList<>();
    public StudentsList(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    public StudentsList(){}

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }
}
