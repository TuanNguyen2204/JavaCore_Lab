
import java.util.ArrayList;
import java.util.List;

public class GroceryBill {

    double total;
    List<Item> items;
    Employee clerk;

    public GroceryBill(Employee clerk) {
        this.items = new ArrayList<>();
        this.clerk = clerk;
        this.total = 0.0;
    }

    public void add(Item i) {
        items.add(i);
        total += i.getPrice();
    }

    public double getTotal() {
        return total;
    }
    
     public void printReceipt() {
         int dem =1;
        System.out.println("Lists of items: ");
        System.out.println("STT" + "\t\t" + "ID Item" + "\t\t" + "Item price");
        for(Item i : items){
            System.out.println(dem + "\t\t" + i.getId() + "\t\t" + i.getPrice());
            dem++;
        }
     }
}

