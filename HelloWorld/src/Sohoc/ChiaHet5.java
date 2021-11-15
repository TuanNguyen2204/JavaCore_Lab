// Xet so chia het cho 5 bang chu so tan cung la 0 hoac 5
package Sohoc;

import java.util.Scanner;

public class ChiaHet5 {
    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so chia het cho 5");
        } else {
            System.out.println(n + " khong phai so chia het cho 5");
        }
    }
    public static boolean check(int num) {
        if(num%10 == 0 || num%10 == 5 || num%10 == -5) return true;
        else return false;
    }
}
