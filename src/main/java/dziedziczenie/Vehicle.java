package dziedziczenie;

public class Vehicle {
    private double speed;
    private double maxSpeed;

    public Vehicle(double speed, double maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
