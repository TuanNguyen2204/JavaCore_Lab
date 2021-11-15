package PEtest;

import java.util.Scanner;

public class Motor {

    private String brandName;
    private double price;

    public Motor() {
    }

    public Motor(String brandName, double price) {
        this.brandName = brandName;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return brandName + " " + price;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter brand name of a motor: ");
        Scanner sc = new Scanner(System.in);
        String brandName = sc.nextLine();
        System.out.print("Enter series of a motor: ");
        String series = sc.nextLine();
        System.out.print("Enter price of a motor: ");
        Double price = sc.nextDouble();
        System.out.println("TC = 1\nTC = 2\nTC = 3");
        System.out.println("Enter TC: ");
        int tc = sc.nextInt();
        Motor mt = new Motor(brandName, price);
        VNMotor vn = new VNMotor(brandName, series, price);
        switch(tc) {
            case 1:
                System.out.println(mt.toString());
                System.out.println(vn.toString());
                break;
            case 2:
                System.out.println(vn.getSalePrice());
                break;
            case 3:
                System.out.println(mt.getBrandName());
                break;
        }
    }
}

class VNMotor extends Motor {

    private String series;

    public VNMotor() {
    }

    public VNMotor(String brandName, String series, double price) {
        super(brandName, price);
        this.series = series;
    }

    public double getSalePrice() {
        Double salePrice;
        if (super.getPrice() < 3000) {
            salePrice = 0.95*super.getPrice();
        }
        else salePrice = 0.9*super.getPrice();
        return salePrice;
    }
    
    public String toString() {
        return super.getBrandName() + " " + series + " " + super.getPrice();
        
    }
}


        
