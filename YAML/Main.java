import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("alla", "baba", true, (byte)2));
        students.add(new Student("allaz", "babayan", true, (byte)3));
        YAMLDecoratorForStudents.writeStudentsFromFile("YAML", students);
        ArrayList<Student> students1 = YAMLDecoratorForStudents.readStudentsFromFile("YAML");
        System.out.println(students1.get(0).getGroup());
    }
}
