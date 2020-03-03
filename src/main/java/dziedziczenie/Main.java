package dziedziczenie;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(23.2, 34.5);
        Vehicle car = new Car(132, 150.9, 1.6);
        Bicycle bicycle = new Bicycle(65, 120.2, 13);
        List<Vehicle> listaPojazdow = new LinkedList<>(List.of(vehicle, car, bicycle));
        for (Vehicle v : listaPojazdow){
            System.out.println(v);
        }
    }
}
