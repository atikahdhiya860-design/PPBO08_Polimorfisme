package Latihan3;

public class Contractor implements Payable {
    double rate;
    int hours;

    public Contractor(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return rate * hours;
    }
}
