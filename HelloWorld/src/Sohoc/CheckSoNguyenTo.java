package Sohoc;

import java.util.Scanner;

public class CheckSoNguyenTo {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        if (checkSnt(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai so nguyen to");
        }

    }

    public static boolean checkSnt(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
