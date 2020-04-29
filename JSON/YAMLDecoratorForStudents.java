import org.ho.yaml.YamlDecoder;
import org.ho.yaml.YamlEncoder;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class YAMLDecoratorForStudents {
    public static void writeStudentsFromFile(String path, ArrayList<Student> students) {
        try (FileOutputStream stream = new FileOutputStream(path)) {
            YamlEncoder encoder = new YamlEncoder(stream);
            for (Student student : students) {
                encoder.writeObject(student);
                encoder.flush();
            }
        }
        catch (IOException e) {
            System.out.println("This file doesn't exist");
        }
    }

    public static ArrayList<Student> readStudentsFromFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        try(FileInputStream stream = new FileInputStream(path)) {
           YamlDecoder decoder = new YamlDecoder(stream);
           while (true) {
               students.add((Student) decoder.readObject());
           }
        }
        catch (EOFException ignored) {}
        catch (IOException e) {
            System.out.println("This file doesn't exist");
        }
        return students;
    }
}
