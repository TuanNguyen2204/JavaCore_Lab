package BTVN;

import java.util.Scanner;

public class PTB2 {

    int a, b, c;
    double x1, x2;
    String status;
    public PTB2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public double getDelta(int a, int b, int c) {
//        return delta;
//    }

    void solve() {
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c != 0) {
                status = "NO";
            } else if (b == 0 && c == 0) {
                status = "ALL";
            } else {
                x1 = -1.0 * c / b;
                status = "Unique";
            }
        } else {
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                status = "Two";
            } else if (delta == 0) {
                x1 = x2 = -1.0 * b / (2 * a);
                status = "Same";
            } else if (delta < 0) {
                status = "NO";
            }
        }
    }

    void display() {
        switch (status) {
            case "NO":
                System.out.println("The equation has no solution");
                break;
            case "ALL":
                System.out.println("Equations have solutions for all x");
                break;
            case "Unique":
                System.out.println("Equations have a unique solution : x = " + x1);
                break;
            case "Same":
                System.out.println("Equations have double solutions: x1 = x2 = " + x1);
                break;
            case "Two":
                System.out.println("The equation has two specific differences : x1 = " + x1 + " x2 = " + x2);
                break;
        }
    }

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        a = sc.nextInt();
        System.out.println("Input b:");
        b = sc.nextInt();
        System.out.println("Input c:");
        c = sc.nextInt();
        PTB2 ptb2 = new PTB2(a, b, c);
        ptb2.solve();
        ptb2.display();
    }
}
