package Sohoc;
//Hãy cùng thử với số 44
//

import java.util.Scanner;

//Lần 1: 4^2 + 4^2 = 32 
//Lần 2: 3^2+2^2 = 13 
//Lần 3: 1^2+3^2 = 10 
//Lần 4: 1^2+0^2 = 1 
public class SoHanhPhuc {

    public static void main(String[] args) {
        System.out.println("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so hanh phuc");
        } else {
            System.out.println(n + " khong la so hanh phuc");
        }
    }

    public static int soHanhPhuc(int x) {
        int remainder = 0, sum = 0;
        while (x > 0) {
            remainder = x % 10;
            sum += remainder * remainder;
            x /= 10;
        }
        return sum;
    }

    public static boolean check(int x) {
        while (x != 1 && x != 4) {
            x = soHanhPhuc(x);
        }
        if (x == 1) {
            return true;
        } else {
            return false;
        }
    }
}
