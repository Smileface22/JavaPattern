import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(25, "John", "Doe", LocalDate.of(1999, 5, 15), 70));
        humans.add(new Human(35, "Alice", "Smith", LocalDate.of(1989, 8, 25), 60));
        humans.add(new Human(45, "Bob", "Johnson", LocalDate.of(1979, 3, 8), 80));
        humans.add(new Human(55, "Emma", "Brown", LocalDate.of(1969, 11, 20), 65));
        humans.add(new Human(65, "Michael", "Smirnov", LocalDate.of(1959, 7, 10), 75));
        System.out.println("Сортировка по дате рождения:");
        Stream<Human> sortedByBirthDate = humans.stream()
                .sorted((h1, h2) -> h1.getBirthDate().compareTo(h2.getBirthDate()));
        sortedByBirthDate.forEach(System.out::println);
        System.out.println("Фильтрация по возврасту меньше 50:");
        Stream<Human> sortedByAge = humans.stream()
                .filter(age -> age.getAge()<50);
        sortedByAge.forEach(System.out::println);
        System.out.println("Список людей, отсортированный по весу:");
        Stream<Human> sortedByWeight = humans.stream()
                .sorted((h1, h2) -> Integer.compare(h1.getWeight(), h2.getWeight()));
        sortedByWeight.forEach(System.out::println);
        System.out.println("Конкатенация всех имен в одну строку:");
        String concatenatedNames = humans.stream()
                .map(Human::getFirstName)
                .collect(Collectors.joining(" "));
        System.out.println(concatenatedNames);

    }
}

