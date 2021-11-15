
package Sohoc;

import java.util.Scanner;

public class SoDuong {
    public static void main(String[] args) {
        System.out.println("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n)) {
            System.out.println(n+" la so duong");
        }
        else {
            System.out.println(n+" khong la so duong");}
    }
    
    public static boolean check(int x) {
        if(x>0) {
        return true;
        }
        else {
            return false;
        }
    }
}
