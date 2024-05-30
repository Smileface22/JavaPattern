import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Интерфейс коллекции
interface Container {
    Iterator<String> getIterator();
}

// Конкретная коллекция
class NameRepository implements Container {
    private List<String> names;

    public NameRepository() {
        names = new ArrayList<>();
    }
    public void addName(String name) {
        names.add(name);
    }
    @Override
    public Iterator<String> getIterator() {
        return new NameIterator(names);
    }
}

// Конкретный итератор
class NameIterator implements Iterator<String> {
    private List<String> names;
    private int index;
    public NameIterator(List<String> names) {
        this.names = names;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < names.size();
    }
    @Override
    public String next() {
        if (this.hasNext()) {
            return names.get(index++);
        }
        return null;
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        nameRepository.addName("John");
        nameRepository.addName("Doe");
        nameRepository.addName("Jane");
        Iterator<String> iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
