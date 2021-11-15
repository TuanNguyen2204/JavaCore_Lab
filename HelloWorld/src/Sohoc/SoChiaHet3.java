package Sohoc;

import java.util.Scanner;

public class SoChiaHet3 {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so chia het cho 3");
        } else {
            System.out.println(n + " khong la so chia het cho 3");
        }
    }

    public static boolean check(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
