package dziedziczenie;

public class Bicycle extends Vehicle {
private int derailleur;
    public Bicycle(double speed, double maxSpeed, int derailleur) {
        super(speed, maxSpeed);
        this.derailleur = derailleur;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "derailleur=" + derailleur +
                "} " + super.toString();
    }
}
