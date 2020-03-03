package dziedziczenie2;

public class Miner extends Employee {
    public Miner(String name) {
        super(name);
    }

    @Override
    protected double getSalary() {
        return super.getSalary() * 1.2;
    }

    @Override
    public String toString() {
        return "Miner{} " + super.toString();
    }
}
