
public class DiscountBill extends GroceryBill {

    boolean preferred;
    int discountCount;
    double discountAmount;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
        this.discountCount = 0;
        this.discountAmount = 0;
    }
        

    public void add(Item i) {
        super.add(i);
        if (preferred && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }
    

    @Override
    public void printReceipt() {
        int dem =1;
       if(preferred == true){
           System.out.println("STT" + "\t\t" + "IDItem" + "\t\t" + "Item price" + "\t" + "Discount");
           for(Item i : items){
            System.out.println( dem + "\t\t" + i.getId() + "\t\t" + i.getPrice() + "\t\t" + i.getDiscount());
             dem++;
        }
       }
       else {
           super.printReceipt();
       }
    }
    
   
    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
    public double getDiscountPercent() {
        return (discountAmount / super.getTotal()) * 100;
    }
    
}

