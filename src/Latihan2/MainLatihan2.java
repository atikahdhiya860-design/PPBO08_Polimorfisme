package Latihan2;

import java.util.*;

public class MainLatihan2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Circle(5));

        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }

        System.out.println("Total area = " + total);
    }
}
