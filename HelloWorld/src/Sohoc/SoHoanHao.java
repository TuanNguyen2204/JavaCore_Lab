//so hoan hao la so co tong cac uoc nhỏ hơn số đó cộng lại bằng số đó
package Sohoc;

import java.util.Scanner;

public class SoHoanHao {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n)) {
            System.out.println(n + " la so hoan hao");}
        else {
            System.out.println(n + " khong phai so hoan hao");}
    }

    public static boolean check(int x) {
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if (x == sum) {
            return true;
        } else {
            return false;
        }
    }
}
