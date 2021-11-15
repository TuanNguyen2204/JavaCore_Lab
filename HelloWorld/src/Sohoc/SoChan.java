package Sohoc;

import java.util.Scanner;

public class SoChan {

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " khong phai la so chan");
        }
    }

    public static boolean check(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
}
