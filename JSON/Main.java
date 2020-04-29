public class Main {
    public static void main(String[] args) {
        StudentsList students= new StudentsList();
        students.addStudent(new Student("all", "have", true, (byte)2));
        students.addStudent(new Student("alla", "haver", true, (byte)3));
        JSONReaderAndWriterForStudents.writeStudents(students, "JSON");
        StudentsList list = JSONReaderAndWriterForStudents.readStudents("JSON");
        System.out.println(list.getStudent(0).getName());
    }
}
