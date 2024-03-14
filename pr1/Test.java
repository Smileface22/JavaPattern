import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Надежда", "ИКБО-20-22"));
        students.add(new Student("Лиза", "ИКБО-23-22"));
        students.add(new Student("Алена", "ИКБО-16-22"));
        students.add(new Student("Яна", "ИКБО-20-22"));
        students.add(new Student("Никита", "ИКБО-23-22"));
        StudentGrouping studentGrouping = new StudentGrouping();
        Map<String, List<Student>> groupedStudents = studentGrouping.apply(students);

        for (String group : groupedStudents.keySet()) {
            System.out.println("Group: " + group);
            List<Student> studentList = groupedStudents.get(group);
            for (Student student : studentList) {
                System.out.println(student);
            }
            System.out.println();
        }
    }
}
