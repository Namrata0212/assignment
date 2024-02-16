class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine; 

    public Car() {
        engine = new Engine(); 
    }

    void start() {
        engine.start();
        System.out.println("Car started");
    }
}

public class question2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); 
    }
}
