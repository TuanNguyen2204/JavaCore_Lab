//A number is called a sunny number
//if the number next to the given number is a perfect square
package Sohoc;

import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {
        System.out.println("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkSunnyNumber(n)) {
            System.out.println(n + " la so Sunny");
        } else {
            System.out.println(n + " khong la so Sunny");
        }
    }

    public static boolean checkSunnyNumber(int number) {
        if (Math.sqrt(number + 1) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
