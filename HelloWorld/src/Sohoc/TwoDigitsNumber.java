package Sohoc;

import java.util.Scanner;

public class TwoDigitsNumber {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check2DigitsNumber(n)) {
            System.out.println(n + " la so co 2 chu so");
        } else {
            System.out.println(n + " khong phai so co 2 chu so");
        }
    }

    public static boolean check2DigitsNumber(int num) {
        if (num >=10 && num<=99) {
            return true;
        } else {
            return false;
        }
    }
}
