package Abstract_fabrica;

// Интерфейс для создания продуктов А
interface AbstractProductA {
    void operationA();
}

// Интерфейс для создания продуктов B
interface AbstractProductB {
    void operationB();
}

// Конкретные продукты A
class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1 operation");
    }
}

class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA2 operation");
    }
}

// Конкретные продукты B
class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB1 operation");
    }
}

class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB2 operation");
    }
}

// Абстрактная фабрика
interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}

// Конкретная фабрика 1
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// Конкретная фабрика 2
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Тест
public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        productA1.operationA();
        productB1.operationB();

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();
        productA2.operationA();
        productB2.operationB();
    }
}
