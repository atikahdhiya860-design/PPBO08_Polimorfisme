package Latihan3;

import java.util.*;

public class MainLatihan3 {
    public static void main(String[] args) {
        List<Payable> list = new ArrayList<>();

        list.add(new Employee(3000000));
        list.add(new Contractor(50000, 40));
        list.add(new Employee(4500000));

        double total = 0;
        for (Payable p : list) {
            total += p.pay();
        }

        System.out.println("Total pembayaran = " + total);
    }
}
