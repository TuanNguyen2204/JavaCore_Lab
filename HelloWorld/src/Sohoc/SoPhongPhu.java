package Sohoc;

import static Sohoc.DuckNumber.checkDuckNumber;
import java.util.Scanner;

public class SoPhongPhu {

    public static void main(String[] args) {
         System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkSoPhongPhu(n)) {
            System.out.println(n + " la So Phong Phu");
        } else {
            System.out.println(n + " khong phai So Phong Phu");
        }
    }

    public static boolean checkSoPhongPhu(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            return true;
        } else {
            return false;
        }
    }
}
