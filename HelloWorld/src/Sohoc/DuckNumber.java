 //Duck Number là số mà trong số đó có ít nhất 1 cs 0 và số 0 ko đc đứng đầu
package Sohoc;

import java.util.Scanner;

public class DuckNumber {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkDuckNumber(n)) {
            System.out.println(n + " la Duck Number");
        } else {
            System.out.println(n + " khong phai Duck Number");
        }
    }

    public static boolean checkDuckNumber(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                num = num / 10;//xoa cs cuoi
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}
