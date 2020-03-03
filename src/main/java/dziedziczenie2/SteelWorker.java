package dziedziczenie2;

public class SteelWorker extends Employee{
    public SteelWorker(String name) {
        super(name);
        getSalary();
    }

    @Override
    protected double getSalary() {
        return super.getSalary() * 1.3;
    }

    @Override
    public String toString() {
        return "SteelWorker{} " + super.toString();
    }
}
