package BTVN;

import java.util.Scanner;

public class PTB1 {

    int a, b;
    double x;
    String status;

    public PTB1() {
    }

    public PTB1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void solve() {       
        if (a == 0) {
            if (b == 0) {
                status = "VSN";
            } else {
                status = "";
            }
        } else {
            status = "CN";
            x = -((double) b) / a;
        }
    }

    void display() {
        System.out.println(status);
        if (status.equals("CN")) {
            System.out.println("x = " + x);
        } else if (status.equals("VSN")) {
            System.out.println("Phuong trinh co vsn");
        } else {
            System.out.println("Phuong trinh VN");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap a, b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PTB1 pt = new PTB1(a, b);
        pt.solve();
        pt.display();
    }
}
