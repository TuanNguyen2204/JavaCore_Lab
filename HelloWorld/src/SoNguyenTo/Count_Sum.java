package SoNguyenTo;

import java.util.Scanner;

public class Count_Sum {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        n = scanner.nextInt();
        //khai báo mảng
        int[] mang = new int[n];
        //nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        System.out.println("Số các số nguyên tố trong mảng là: " + count(mang));
        System.out.println("Tổng các số nguyên tố trong mảng là: " + sum(mang));
    }
 //đếm và trả về số các snt trong mảng
    public static int count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (checkNguyenTo(a[i])) {
                count++;
            }
        }
        return count;
    }

//tính và trả về tổng các snt trong mảng
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (checkNguyenTo(a[i])) {
                sum += a[i];
            }
        }
        return sum;
    }

   
    public static boolean checkNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
