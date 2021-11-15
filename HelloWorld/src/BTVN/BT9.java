package BTVN;

import java.util.Scanner;

public class BT9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        int i, n;
        for (i = 0;; i++) {
            if (1 / (double) gt(i) < a) {
                n = i;
                break;
            }
        }
        System.out.println("Tong day so = " + tongDayso(n));
    }

    static long gt(int n) {
        long gt = 1, i;
        for (i = 1; i <= n; i++) {
            gt = gt * i;
        }
        return gt;
    }

    static double tongDayso(int n) {
        int i;
        double s = 0;
        for (i = 1; i <= n; i++) {
            s = s + 1 / (double) gt(i);
        }
        return s;
    }
}
