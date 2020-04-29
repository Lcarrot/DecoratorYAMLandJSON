import java.io.Serializable;

public class Student implements Serializable {
    
    public String name;
    public String surname;
    public boolean sex;
    public int group;

    public Student(String name, String surname, boolean sex, int group) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.group = group;
    }

    public Student(){}

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public boolean getSex() {
        return sex;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        String gender =  sex ? "man" : "woman";
        int group = 900+this.group;
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", gender='" + gender + '\'' +
                '}';
    }
}
