import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        //Declare new Employee 
        Employee e = new Employee("Tuan");

        //Start create discount bill
        DiscountBill bill = new DiscountBill(e, true);

        // Create some items and put them in the bill
        bill.add(new Item("01", 3.34, 0.2));
        bill.add(new Item("22", 6.78, 0.5));
        bill.add(new Item("11", 4.56, 0.3));

        //print receipt
        bill.printReceipt();
        System.out.println("Number of discount: " + bill.getDiscountCount());
        System.out.println("Total price: " + bill.getTotal());
        System.out.println("Discount amount: " + df.format(bill.getDiscountAmount()));
        System.out.println("Customer " + e.getName() + " need to Pay: " + df.format(bill.getTotal() - bill.getDiscountAmount()));
        System.out.println("Discount percent: " + df.format(bill.getDiscountPercent()) + "%");

    }

}
