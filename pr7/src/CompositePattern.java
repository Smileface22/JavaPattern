import java.util.ArrayList;
import java.util.List;
interface Car {
    void draw(String color);
}
class SportCar implements Car {
    public void draw(String color) {
        System.out.println("SportCar color: " + color);
    }
}
class UnknownCar implements Car {
    public void draw(String color) {
        System.out.println("UnknownCar color: " + color);
    }
}
class Drawing implements Car {
    private List<Car> cars = new ArrayList<Car>();
    public void draw(String color) {
        for(Car car : cars) {
            car.draw(color);
        }
    }
    public void add(Car s){
        this.cars.add(s);
    }
    public void clear(){
        System.out.println();
        this.cars.clear();
    }
    public void remove(Car car) {
        this.cars.remove(car);
    }

    public Car getChild(int index) {
        return this.cars.get(index);
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("green");
        Car retrievedCar = drawing.getChild(0);
        retrievedCar.draw("blue");
        drawing.remove(sportCar);
        drawing.draw("white");
    }
}
