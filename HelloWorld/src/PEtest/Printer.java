package PEtest;

import java.util.List;

public class Printer {

    private double price;
    private String name;

    public Printer() {
    }

    public Printer(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class MyPrinter implements IPrinter {

    public void f1(List<Printer> a, double price) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice() <= price) {
                a.remove(i);
                i--;
            }
        }
    }

    public int f2(List<Printer> a, String name) {
        int count = 0;
        for (Printer o : a) {
            if (o.getName().toLowerCase().contains(name.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

}
