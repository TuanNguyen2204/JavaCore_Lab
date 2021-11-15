package Sohoc;

import java.util.Scanner;

public class SoFibonacci {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (SoFibonacci.checkFibonacci(n)) {
            System.out.println(n + " la so fibonacci");
        } else {
            System.out.println(n + " khong la so fibonacci");
        }
    }
    

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static boolean checkFibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            if (SoFibonacci.fibonacci(i) == n) {
                return true;
            }
        }
        return false;
    }
}

