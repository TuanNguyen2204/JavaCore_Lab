
package HW;

public class TV {
    String name;
    int size;
    double price;

    public TV() {
    }

    public TV(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TV{" + "name=" + name + ", size=" + size + ", price=" + price + "}";
    } 
}   
