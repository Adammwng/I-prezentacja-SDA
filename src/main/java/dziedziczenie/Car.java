package dziedziczenie;

public class Car extends Vehicle {
    private double engine;

    public Car(double speed, double maxSpeed, double engine) {
        super(speed, maxSpeed);
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                "} " + super.toString();
    }
}
