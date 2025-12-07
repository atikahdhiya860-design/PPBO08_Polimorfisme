package Latihan1;

public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}
