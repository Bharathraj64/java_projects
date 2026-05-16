import java.util.ArrayList;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Bharath", 101));
        students.add(new Student("Raj", 102));

        for (Student s : students) {
            System.out.println(s.id + " - " + s.name);
        }
    }
}