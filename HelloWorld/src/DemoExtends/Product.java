
package DemoExtends;

public class Product {
    String name;
    double giaban;
    double gianhap;

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public double getGiaban() {
        return giaban;
    }
    
}


class Food extends Product {
    int hsd;
}

class UsingProduct {
    public static void main(String[] args) {
        Food f = new Food();
        f.name = "Banh my";
    }
}
