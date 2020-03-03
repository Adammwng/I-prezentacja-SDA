package dziedziczenie2;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        salary = 1000;
    }

    protected double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        Employee employee = new Employee("Jack");
        Miner miner = new Miner("John");
        SteelWorker steelWorker = new SteelWorker("Susan");
        System.out.println(employee);
        System.out.println(miner);
        System.out.println(steelWorker);
    }
}
