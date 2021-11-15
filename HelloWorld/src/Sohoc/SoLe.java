
package Sohoc;

import java.util.Scanner;

public class SoLe {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so le");
        } else {
            System.out.println(n + " khong phai la so le");
        }
    }

    public static boolean check(int x) {
        if (x % 2 == 1) {
            return true;
        }
        return false;
    }
}
