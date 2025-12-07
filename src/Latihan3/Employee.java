package Latihan3;

public class Employee implements Payable {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }
}
