import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONReaderAndWriterForStudents {

    public static void writeStudents(StudentsList students, String path){
        try(FileWriter fileWriter = new FileWriter(path)) {
            Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
            String json = gson.toJson(students);
            fileWriter.write(json);
            fileWriter.flush();
        }
        catch (IOException e) {
            System.out.println("This file doesn't exist");
        }
    }

    public static StudentsList readStudents(String path) {
        StudentsList studentsList = new StudentsList();
        try (FileReader fileReader = new FileReader(path)) {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            studentsList = gson.fromJson(fileReader, StudentsList.class);
        }
        catch (IOException e) {
            System.out.println("This file doesn't exist");
        }
        return studentsList;
    }

}
