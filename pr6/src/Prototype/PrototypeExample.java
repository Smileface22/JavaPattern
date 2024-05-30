package Prototype;

// Интерфейс прототипа
interface Prototype {
    Prototype clone();
}

// Конкретный прототип
class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field='" + field + '\'' +
                '}';
    }
}

// Клиентский код
public class PrototypeExample {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Initial field value");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();

        System.out.println("Original prototype: " + prototype);
        System.out.println("Cloned prototype: " + clonedPrototype);
    }
}
