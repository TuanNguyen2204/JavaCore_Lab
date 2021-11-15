package Sohoc;

import java.util.Scanner;

public class SoChinhPhuong {

    public static void main(String[] args) {
        System.out.println("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkSoChinhPhuong(n)) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai so chinh phuong");
        }
    }

    public static boolean checkSoChinhPhuong(int x) {
        int temp = (int) Math.sqrt(x);
        if (temp * temp - x == 0) {
            return true;
        } else {
            return false;
        }
    }
}
