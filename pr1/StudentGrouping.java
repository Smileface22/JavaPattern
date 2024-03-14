import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudentGrouping implements Function<List<Student>, Map<String, List<Student>>> {

    @Override
    public Map<String, List<Student>> apply(List<Student> students) {
        Map<String, List<Student>> groupedMap = new HashMap<>();
        for (Student student : students) {
            groupedMap.computeIfAbsent(student.getGroup(), k -> new ArrayList<>()).add(student);
        }
        return groupedMap;
    }
}
