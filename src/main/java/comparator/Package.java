package comparator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Package {
    double value;
    double weight;
    LocalDate shipDate;

    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    @Override
    public String toString() {
        return "Package{" +
                "value=" + value +
                ", weight=" + weight +
                ", shipDate=" + shipDate +
                '}';
    }

    public Package(double value, double weight, LocalDate shipDate) {
        this.value = value;
        this.weight = weight;
        this.shipDate = shipDate;
    }
}
