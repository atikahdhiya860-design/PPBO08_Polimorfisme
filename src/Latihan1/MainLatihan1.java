package Latihan1;

import java.util.*;

public class MainLatihan1 {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Dog());
        list.add(new Bird());
        list.add(new Dog());

        for (Animal a : list) {
            a.speak();
            if (a instanceof Dog) {
                ((Dog) a).fetch();
            }
        }
    }
}
