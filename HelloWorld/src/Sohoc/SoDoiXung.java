package Sohoc;

import java.util.Scanner;

public class SoDoiXung {

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so doi xung");}
        else {
            System.out.println(n + " khong phai la so doi xung");}
    }

    public static boolean check(int x) {
        int num = 0, reversed = 0, remainder;
        x = num;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        if (x == reversed) {
            return true;
        } else {
            return false;
        }
    }
}
